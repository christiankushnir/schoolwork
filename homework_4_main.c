#include <bits/stdc++.h>
using namespace std;

struct TreeNode {
        int key;
        struct TreeNode *left, *right;
};

TreeNode* newTreeNode(int item){
        TreeNode* temp = new TreeNode;
        temp->key = item;
        temp->left = temp->right = NULL;
        return temp;
}

void inorder_traversel(TreeNode* root){
        if (root != NULL) {
                inorder_traversel(root->left);
                cout<<root->key<<" ";
                inorder_traversel(root->right);
        }
}

void preorder_traversel(TreeNode* root){
        if (root != NULL) {
            cout<<root->key<<" ";
                preorder_traversel(root->left);
                preorder_traversel(root->right);
        }
}

TreeNode* insert(TreeNode* TreeNode, int key){
        if (TreeNode == NULL)
                return newTreeNode(key);

        if (key < TreeNode->key)
                TreeNode->left = insert(TreeNode->left, key);
        else
                TreeNode->right = insert(TreeNode->right, key);

        return TreeNode;
}

TreeNode* deleteTreeNode(TreeNode* root, int k){
        if (root == NULL)
                return root;

        if (root->key > k) {
                root->left = deleteTreeNode(root->left, k);
                return root;
        }
        else if (root->key < k) {
                root->right = deleteTreeNode(root->right, k);
                return root;
        }

        if (root->left == NULL) {
                TreeNode* temp = root->right;
                delete root;
                return temp;
        }
        else if (root->right == NULL) {
                TreeNode* temp = root->left;
                delete root;
                return temp;
        }
        else {

                TreeNode* succParent = root;

                TreeNode* succ = root->right;
                while (succ->left != NULL) {
                        succParent = succ;
                        succ = succ->left;
                }
                if (succParent != root)
                        succParent->left = succ->right;
                else
                        succParent->right = succ->right;

                root->key = succ->key;

                delete succ;
                return root;
        }
}

int main(){
    int arr[]={17,5,35,2,11,29,38,9,16,3};
    int n=sizeof(arr)/sizeof(arr[0]);
        TreeNode* root = NULL;
        for(int i=0;i<n;i++){
            root = insert(root, arr[i]);
        }
        cout<<"Inorder traversel of tree:\n";
        inorder_traversel(root);
        cout<<"\nPreorder traversel of tree:\n";
        preorder_traversel(root);
    deleteTreeNode(root, 16);
    cout<<"\nInorder traversel with deletion:\n";
        inorder_traversel(root);
        cout<<"\nPreorder traversel with deletion:\n";
        preorder_traversel(root);
        return 0;
}
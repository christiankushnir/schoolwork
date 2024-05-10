import sys

def confu(dictname, inname, outname):
	confulist = []
	linewords = []

	#open and read in the dictionary
	#  the dictionary is a list of lists
	#	each sublist is a tab-separated list of
	#	two to three words
	file = open(dictname, 'r')
	for line in file.readlines():
		confulist.append(line.strip().split("\t"))

	file.close()

	#open up the file of text whose words you
	#	are going to replace 'inname'
	file = open(inname, 'r')
	
	#open up/create the file that will hold the
	#	modified version of 'infile'
	outfile = open(outname, 'w')

	#for each line in 'infile' ... 
	for line in file.readlines():
		#get a list of all the words in it ...
		linewords = line.strip().split(" ")
		# for each word in the file...
		#--> fill in line here
		
		for word in linewords:
			#for each sublist in the dictionary...
			# ---> fill in line here
			

			for sub_list in confulist:
				# if that word appears in a sublist,
				#   replace it with one of the other word(s) in
				#   that sublist
				# ---> fill in multiple lines here
				
				#print("SUBLIST: ")
				#print(sub_list)
				length = len(sub_list)
				match = 0
				beenReplaced = 0
				for word2 in sub_list:
					if word != word2:
						match = match + 1
					#replace
					if word == word2 and beenReplaced == 0:
						
						beenReplaced = 1

						
						if match == length - 1:
							line = line.replace(word, sub_list[match - 1])
							
						else:
							line = line.replace(word, sub_list[match + 1])
						
						
				
		# write the modified line out to the 'outfile'

		outfile.write(line)

	file.close()
	outfile.close()
	
def main ( ):
	confu(sys.argv[1], sys.argv[2], sys.argv[3])

if __name__ == '__main__':
	main()


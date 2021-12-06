# individual-project-mmandapati
individual-project-mmandapati created by GitHub Classroom

## Problem Statement
To Develop a java application which contains the information of the items and cards, where the users can purchase the products. This Application validates the purchases by checking the existing quantity and cap allowed for that category.
If the purchase satisfies all the requirements then the total amount paid will be displayed in output.txt else errors will be displayed in error.txt file.

## Instructions to run the application:
1. Download the file by clicking Code -> Download ZIP on github repository.
2. Once downloaded, extract the .zip file and open this file in your Eclipse Workspace.
3. Once opened, Goto individual-project-mmandapati -> src/main/java -> ind_202 -> Ind202Application.java
4. Choose Ind202Application.java and run this file as a java application
5. You will be prompted to "Enter the input file name that needs to be tested:", enter the inputfile name.
6. Once the project is run successfully and the corresponding output.txt or error.txt files will be created in the same project folder structure in the workspace.

## Design Patterns Used:

### Chain of Responsibility

This pattern is used to validate the quantity and price of the purchase in a step-by-step way. First, the quantity of the products and the cap of teh products are validated and then once the quantities are check the next step is to calculate the total price of the purchase.

![image](https://user-images.githubusercontent.com/91310893/144801415-58ea11ef-c877-4e0c-b493-78312e7760ac.png)


### Singleton

This pattern is used to get the cap values of the categories for the application. when an Instance of cap values are needed, the getInstance() method is called to get the cap values of the categories.

![image](https://user-images.githubusercontent.com/91310893/144799710-a2a6e7b9-84f4-429e-9f37-96f0c0ad7311.png)

### Factory

This pattern is used to identify and read the dataset file or read the Input file. When the Handler decides which file to read then the respective class is implemented.
ScanInputFile class is used to read the input files provided where the ReadData class is used to read the dataset file.

![image](https://user-images.githubusercontent.com/91310893/144802714-3e166f90-0423-40dc-a891-fa918ab8898a.png)


## Screenshots of Test Cases:

### Test Case 1: 

![testcase1](https://user-images.githubusercontent.com/91310893/144797685-4d347cf3-7274-4439-bdd5-9bc9543935a6.PNG)

### Test Case 2:

![testcase2](https://user-images.githubusercontent.com/91310893/144797776-1a2b584f-eef5-498e-aa2e-2580b96dd4b3.PNG)

### Test Case 3:

![testcase3](https://user-images.githubusercontent.com/91310893/144797811-068894ff-faa4-48ce-b233-0e394a0ad1f7.PNG)

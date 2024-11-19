# **CanvasAPI Integration**

## **Overview**
CanvasAPI is a command-line application designed to streamline interactions with:
1. **Canvas LMS**: Handles tasks like retrieving course discussions and files.
2. **OpenAI ChatGPT**: Generates AI-driven responses based on course materials and prompts.

---

## **Features**

### **Canvas LMS Integration**
- Retrieve all discussions or the most recent discussion from a course.
- Access and process course files, sorted by creation date.

### **ChatGPT API Integration**
- Send prompts based on Canvas data to ChatGPT and retrieve responses.
- Post AI-generated responses directly back to Canvas discussions.

---

## **Getting Started**

### **Prerequisites**
- Java 22 or later.
- Required libraries: org.json for handling JSON data and Apache PDFBox for PDF processing.

### **Setup**
1. Clone the repository and navigate to the project directory.
2. Build the project using Maven.
3. Run the application from the command line.

---

## **Usage**
- Fetch the latest course file and discussion topic.
- Use the file and discussion content to create a prompt for ChatGPT.
- Post the generated AI response back to Canvas.

---

## **Support**
For questions or assistance, reach out to the repository maintainer.

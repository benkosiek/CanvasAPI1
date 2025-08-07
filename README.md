# 📚 Canvas AutoResponder with OpenAI (Java)

This Java application connects to your Canvas LMS, retrieves the most recent course document and discussion post, processes the content using OpenAI's GPT API, and automatically replies to the post using a generated response.

---

## 🚀 Features

- Fetches the latest uploaded **PDF** from a specified Canvas course
- Retrieves the most recent **discussion post**
- Uses **OpenAI's GPT API** to generate a contextual response
- Automatically posts the response as a reply in Canvas
- Designed for automated academic assistance

---

## 🛠 Technologies Used

- **Java 11+**
- **OpenAI API** (`gpt-4o`)
- **Canvas LMS API**
- **Apache PDFBox** – for extracting text from PDF files
- **org.json** – for parsing JSON responses

---

## 📂 Project Structure

```plaintext
.
├── Main.java         # Main controller to coordinate the process
├── Canvas.java       # Handles Canvas API calls and PDF parsing
├── ChatGPT.java      # Sends prompts and receives responses from OpenAI



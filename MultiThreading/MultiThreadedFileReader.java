/*
 ************************************ First Question  ********************************.
Q1) WAP to read data from three different files namely file1.txt, file2.txt, file3.txt and save
    all these 3 file's content in an another single file namely content.txt using multithreading in java.
*/

/*
content from file one :
This is the content of file1.txt.
Hello from file1 my name is vishal .

content from file Two
Content of file2.txt is different.
Greetings from vishal Sharma !

content from file three:
Here's the content of file3.txt.
Hello this side vishal Subhash Sharma !
 */



/*
  Name = Vishal Sharma.
*/
package MultiThreading;

import java.io.*;

// Define a thread class to read content from a file and write it to a BufferedWriter
class FileReaderThread extends Thread {
    private String fileName; // Name of the file to read
    private BufferedWriter writer; // Writer to write content to a single file

    // Constructor to initialize the file name and writer
    public FileReaderThread(String fileName, BufferedWriter writer) {
        this.fileName = fileName;
        this.writer = writer;
    }

    // Method that is executed when the thread starts
    @Override
    public void run() {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            // Read each line from the file and write it to the BufferedWriter
            while ((line = reader.readLine()) != null) {
                synchronized (writer) { // Synchronize to avoid concurrent writes by multiple threads
                    writer.write(line);
                    writer.newLine(); // Add a new line after each line of content
                }
            }
        } catch (IOException e) {
            e.printStackTrace(); // Print any IOException that occurs during file reading
        }
    }
}

// Main class to orchestrate the reading from multiple files using threads
public class MultiThreadedFileReader {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("content.txt"))) {
            // Create an array of threads, one for each file
            Thread[] threads = new Thread[3];
            threads[0] = new FileReaderThread("C:\\Users\\visha\\IdeaProjects\\AnudipLabWork\\src\\MultiThreading\\file1.txt", writer);
            threads[1] = new FileReaderThread("C:\\Users\\visha\\IdeaProjects\\AnudipLabWork\\src\\MultiThreading\\file2.txt", writer);
            threads[2] = new FileReaderThread("C:\\Users\\visha\\IdeaProjects\\AnudipLabWork\\src\\MultiThreading\\file3.txt", writer);

            // Start each thread to read from the respective file
            for (Thread thread : threads) {
                thread.start();
            }

            // Wait for all threads to finish executing
            for (Thread thread : threads) {
                thread.join();
            }

            // Print a message indicating that all files have been read and content has been saved
            System.out.println("All files have been read and content has been saved to content.txt.");
        } catch (IOException | InterruptedException e) {
            e.printStackTrace(); // Print any IOException or InterruptedException that occurs
        }
    }
}
/*
 output.
Content of file2.txt is different.
It contains its own text.
This is the content of file1.txt.
It has some text in it.
Greetings from file2!
Hello from file1!
*/
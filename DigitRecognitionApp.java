// public class DigitRecognitionApp {
//     public static void main(String[] args) {
//         // Load dataset
//         double[][] trainingData = DatasetHandler.loadTrainingData();
//         int[] labels = DatasetHandler.loadLabels();

//         // Initialize neural network
//         NeuralNetwork nn = new NeuralNetwork(25, 10, 10, 0.1);

//         // Train the model
//         nn.train(trainingData, labels, 1000); // Train for 1000 epochs

//         // Test the model with a new digit (example)
//         // double[] testSample = {1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1};

//         // double[] testSample = {
//         //     1, 1, 1, 1, 1,
//         //     1, 0, 0, 0, 0,
//         //     1, 1, 1, 0, 0,
//         //     0, 0, 0, 0, 1,
//         //     1, 1, 1, 1, 0
//         // };


//         // double[] testSample0 = {
//         //     1, 1, 1, 1, 1,
//         //     1, 0, 0, 0, 1,
//         //     1, 0, 0, 0, 1,
//         //     1, 0, 0, 0, 1,
//         //     1, 1, 1, 1, 1
//         // };
//         // int prediction0 = nn.predict(testSample0);
//         // System.out.println("Predicted Digit for testSample0: " + prediction0);
//         // // int prediction = nn.predict(testSample);

//         // System.out.println("Predicted Digit: " + prediction0);



//         // double[] noisyTestSample = {
//         //     1, 1, 1, 1, 1,
//         //     1, 0, 0, 0, 0,
//         //     1, 1, 1, 0, 0,
//         //     0, 0, 0, 0, 1,
//         //     1, 1, 1, 1, 0
//         // };
//         // int noisyPrediction = nn.predict(noisyTestSample);
//         // System.out.println("Predicted Digit for noisyTestSample: " + noisyPrediction);


//         // double[] unseenTestSample3 = {
//         //     1, 1, 1, 1, 1,
//         //     0, 0, 0, 0, 1,
//         //     0, 1, 1, 1, 1,
//         //     0, 0, 0, 0, 1,
//         //     1, 1, 1, 1, 1
//         // };
//         // int unseenPrediction = nn.predict(unseenTestSample3);
//         // System.out.println("Predicted Digit for unseenTestSample3: " + unseenPrediction);



//         int[] labels = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
// double[][] testSamples = {
//     {1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1}, // Digit '0'
//     {0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 1, 1, 1, 1}, // Digit '1'
//     // Add more test samples...
// };
// int correct = 0;
// for (int i = 0; i < testSamples.length; i++) {
//     int predicted = nn.predict(testSamples[i]);
//     if (predicted == labels[i]) {
//         correct++;
//     }
// }
// double accuracy = (double) correct / labels.length * 100;
// System.out.println("Model Accuracy: " + accuracy + "%");
//     }
// }

// // public class DigitRecognitionApp {
// //     public static void main(String[] args) {
// //         System.out.println("Application Started!");
// //         // Your application logic here...
// //     }
// // }



// public class DigitRecognitionApp{
// public static void main(String[] args) {
//     // Step 1: Load dataset
//     double[][] trainingData = DatasetHandler.loadTrainingData();
//     int[] labels = DatasetHandler.loadLabels();

//     // Step 2: Initialize neural network
//     NeuralNetwork nn = new NeuralNetwork(25, 10, 10, 0.1);

//     // Step 3: Train the model
//     nn.train(trainingData, labels, 1000); // Train for 1000 epochs

//     // Step 4: Evaluate the model
//     int correct = 0;
//     for (int i = 0; i < trainingData.length; i++) {
//         int predicted = nn.predict(trainingData[i]);
//         if (predicted == labels[i]) {
//             correct++;
//         } else {
//             // Log misclassifications
//             System.out.println("Misclassified!");
//             System.out.println("Expected: " + labels[i] + ", Predicted: " + predicted);
//             System.out.println("Input Grid: " + java.util.Arrays.toString(trainingData[i]));
//         }
//     }

//     // Step 5: Calculate and print accuracy
//     double accuracy = (double) correct / labels.length * 100;
//     System.out.println("Model Accuracy: " + accuracy + "%");
// }
// }





// public class DigitRecognitionApp
// {
//     public static void main(String[] args) 
//     {
//         // Step 1: Load dataset
//         double[][] trainingData = DatasetHandler.loadTrainingData();
//         int[] labels = DatasetHandler.loadLabels();
    
//         // Step 2: Initialize neural network
//         NeuralNetwork nn = new NeuralNetwork(25, 10, 10, 0.1);
    
//         // Step 3: Train the model
//         nn.train(trainingData, labels, 1000); // Train for 1000 epochs
    
//         // Step 4: Evaluate the model
//     // Step 4: Evaluate the model
// int correct = 0;
// for (int i = 0; i < trainingData.length; i++) {
//     int predicted = nn.predict(trainingData[i]);
//     if (predicted == labels[i]) {
//         correct++;
//     } else {
//         // Enhanced Misclassification Logging
//         System.out.println("\n=== Misclassification Detected ===");
//         System.out.println("⮞ Expected Digit: " + labels[i]);
//         System.out.println("⮞ Predicted Digit: " + predicted);

//         // Display the input grid in a human-readable 5x5 format
//         System.out.println("⮞ Input Grid:");
//         for (int row = 0; row < 5; row++) {
//             for (int col = 0; col < 5; col++) {
//                 System.out.print((int) trainingData[i][row * 5 + col] + " ");
//             }
//             System.out.println(); // Move to the next row
//         }

//         // Debug information
//         System.out.println("⮞ Suggested Debug Info:");
//         System.out.println("   - Investigate similar training samples.");
//         System.out.println("   - Augment training data for patterns like this.");

//         System.out.println("==================================\n");
//     }
// }
//     //     // Step 5: Calculate and print accuracy
//     //     double accuracy = (double) correct / labels.length * 100;
//     //     System.out.println("Model Accuracy: " + accuracy + "%");
//      }
//     }
    
    
    
    
// import java.util.Arrays;

// public class DigitRecognitionApp {
//     public static void main(String[] args) {
//         // Step 1: Load dataset
//         double[][] trainingData = DatasetHandler.loadTrainingData();
//         int[] labels = DatasetHandler.loadLabels();

//         // Step 2: Initialize neural network
//         NeuralNetwork nn = new NeuralNetwork(25, 10, 10, 0.1);

//         // Step 3: Train the model
//         System.out.println("Training the neural network...");
//         nn.train(trainingData, labels, 1000); // Train for 1000 epochs
//         System.out.println("Training complete!\n");

//         // Step 4: Evaluate metrics and log misclassifications
//         System.out.println("=== Evaluation Metrics ===");
//         int correct = 0;
//         for (int i = 0; i < trainingData.length; i++) {
//             int predicted = nn.predict(trainingData[i]);
//             if (predicted == labels[i]) {
//                 correct++;
//             } else {
//                 // Log misclassifications
//                 System.out.println("=== Misclassification Detected ===");
//                 System.out.println("Expected Digit: " + labels[i]);
//                 System.out.println("Predicted Digit: " + predicted);

//                 // Display the input grid in a human-readable format (5x5 grid)
//                 System.out.println("Input Grid:");
//                 for (int row = 0; row < 5; row++) {
//                     for (int col = 0; col < 5; col++) {
//                         System.out.print((int) trainingData[i][row * 5 + col] + " ");
//                     }
//                     System.out.println(); // Move to the next row
//                 }
//                 System.out.println("==================================");
//             }
//         }

//         // Calculate and print accuracy
//         double accuracy = (double) correct / labels.length * 100;
//         System.out.println("Model Accuracy: " + accuracy + "%\n");

//         // Step 5: Basic Testing
//         System.out.println("=== Basic Testing ===");
//         double[] testSample0 = {
//             1, 1, 1, 1, 1,
//             1, 0, 0, 0, 1,
//             1, 0, 0, 0, 1,
//             1, 0, 0, 0, 1,
//             1, 1, 1, 1, 1
//         };
//         int basicPrediction = nn.predict(testSample0);
//         System.out.println("Predicted Digit for Basic Test (Digit '0'): " + basicPrediction + "\n");

//         // Step 6: Noisy Data Testing
//         System.out.println("=== Noisy Data Testing ===");
//         double[] noisyTestSample = {
//             1, 1, 1, 1, 1,
//             1, 0, 0, 0, 0,
//             1, 1, 1, 0, 0,
//             0, 0, 0, 0, 1,
//             1, 1, 1, 1, 0
//         };
//         int noisyPrediction = nn.predict(noisyTestSample);
//         System.out.println("Predicted Digit for Noisy Test (Digit '5'): " + noisyPrediction + "\n");

//         // Step 7: Unseen Data Testing
//         System.out.println("=== Unseen Data Testing ===");
//         double[] unseenTestSample3 = {
//             1, 1, 1, 1, 1,
//             0, 0, 0, 0, 1,
//             0, 1, 1, 1, 1,
//             0, 0, 0, 0, 1,
//             1, 1, 1, 1, 1
//         };
//         int unseenPrediction = nn.predict(unseenTestSample3);
//         System.out.println("Predicted Digit for Unseen Test (Digit '3'): " + unseenPrediction + "\n");

//         // Step 8: Edge Cases Testing
//         System.out.println("=== Edge Case Testing ===");
//         double[] blankGrid = {
//             0, 0, 0, 0, 0,
//             0, 0, 0, 0, 0,
//             0, 0, 0, 0, 0,
//             0, 0, 0, 0, 0,
//             0, 0, 0, 0, 0
//         };
//         int blankPrediction = nn.predict(blankGrid);
//         System.out.println("Predicted Digit for Blank Grid (Edge Case): " + blankPrediction);

//         double[] filledGrid = {
//             1, 1, 1, 1, 1,
//             1, 1, 1, 1, 1,
//             1, 1, 1, 1, 1,
//             1, 1, 1, 1, 1,
//             1, 1, 1, 1, 1
//         };
//         int filledPrediction = nn.predict(filledGrid);
//         System.out.println("Predicted Digit for Fully Filled Grid (Edge Case): " + filledPrediction + "\n");
//     }
// }    
    


/*Here’s the updated code for the  class, incorporating a rejection threshold mechanism to handle edge cases properly. 
If the model's confidence (maximum output probability) is below the threshold, the input is classified as "Input not recognized." */
import java.util.Arrays;

public class DigitRecognitionApp {
    public static void main(String[] args) {
        // Step 1: Load dataset
        double[][] trainingData = DatasetHandler.loadTrainingData();
        int[] labels = DatasetHandler.loadLabels();

        // Step 2: Initialize neural network
        NeuralNetwork nn = new NeuralNetwork(25, 10, 10, 0.1);

        // Step 3: Train the model
        System.out.println("Training the neural network...");
        nn.train(trainingData, labels, 1000); // Train for 1000 epochs
        System.out.println("Training complete!\n");

        // Step 4: Evaluate metrics and log misclassifications
        System.out.println("=== Evaluation Metrics ===");
        int correct = 0;
        for (int i = 0; i < trainingData.length; i++) {
            int predicted = nn.predict(trainingData[i]);
            if (predicted == labels[i]) {
                correct++;
            } else {
                // Log misclassifications
                System.out.println("=== Misclassification Detected ===");
                System.out.println("Expected Digit: " + labels[i]);
                System.out.println("Predicted Digit: " + predicted);

                // Display the input grid in a human-readable format (5x5 grid)
                System.out.println("Input Grid:");
                for (int row = 0; row < 5; row++) {
                    for (int col = 0; col < 5; col++) {
                        System.out.print((int) trainingData[i][row * 5 + col] + " ");
                    }
                    System.out.println(); // Move to the next row
                }
                System.out.println("==================================");
            }
        }

        // Calculate and print accuracy
        double accuracy = (double) correct / labels.length * 100;
        System.out.println("Model Accuracy: " + accuracy + "%\n");

        // Step 5: Test edge cases with rejection threshold
        System.out.println("=== Edge Case Testing with Rejection Threshold ===");
        double rejectionThreshold = 0.5; // Confidence threshold

        // Edge case: Blank Grid (All Zeros)
        double[] blankGrid = {
            0, 0, 0, 0, 0,
            0, 0, 0, 0, 0,
            0, 0, 0, 0, 0,
            0, 0, 0, 0, 0,
            0, 0, 0, 0, 0
        };
        handlePredictionWithThreshold(nn, blankGrid, rejectionThreshold, "Blank Grid");

        // Edge case: Fully Filled Grid (All Ones)
        double[] filledGrid = {
            1, 1, 1, 1, 1,
            1, 1, 1, 1, 1,
            1, 1, 1, 1, 1,
            1, 1, 1, 1, 1,
            1, 1, 1, 1, 1
        };
        handlePredictionWithThreshold(nn, filledGrid, rejectionThreshold, "Fully Filled Grid");
    }

    private static void handlePredictionWithThreshold(NeuralNetwork nn, double[] inputGrid, double threshold, String testCaseName) {
        System.out.println("Testing: " + testCaseName);
        double[] outputProbabilities = nn.predictProbabilities(inputGrid); // Assuming predictProbabilities returns output probabilities
        double maxProbability = Arrays.stream(outputProbabilities).max().getAsDouble();
        
        if (maxProbability < threshold) {
            System.out.println("⮞ Input not recognized (confidence below threshold).");
        } else {
            int predictedDigit = nn.predict(inputGrid); // Get the digit with the highest probability
            System.out.println("⮞ Predicted Digit: " + predictedDigit);
        }
        System.out.println("Confidence Scores: " + Arrays.toString(outputProbabilities));
        System.out.println("==================================\n");
    }
}
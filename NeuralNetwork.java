import java.util.Random;

public class NeuralNetwork {
    private final int inputSize; // Number of input neurons
    private final int hiddenSize; // Number of hidden neurons
    private final int outputSize; // Number of output neurons

    private double[][] weightsInputHidden; // Weights between input and hidden layers
    private double[][] weightsHiddenOutput; // Weights between hidden and output layers
    private double[] hiddenLayer; // Hidden layer activations
    private double[] outputLayer; // Output layer activations
    private double learningRate;

    public NeuralNetwork(int inputSize, int hiddenSize, int outputSize, double learningRate) {
        this.inputSize = inputSize;
        this.hiddenSize = hiddenSize;
        this.outputSize = outputSize;
        this.learningRate = learningRate;

        // Initialize weights with random values
        weightsInputHidden = new double[inputSize][hiddenSize];
        weightsHiddenOutput = new double[hiddenSize][outputSize];
        hiddenLayer = new double[hiddenSize];
        outputLayer = new double[outputSize];
        initializeWeights();
    }

    private void initializeWeights() {
        Random rand = new Random();
        for (int i = 0; i < inputSize; i++) {
            for (int j = 0; j < hiddenSize; j++) {
                weightsInputHidden[i][j] = rand.nextDouble() - 0.5; // Random weights between -0.5 and 0.5
            }
        }
        for (int i = 0; i < hiddenSize; i++) {
            for (int j = 0; j < outputSize; j++) {
                weightsHiddenOutput[i][j] = rand.nextDouble() - 0.5;
            }
        }
    }

    public void train(double[][] inputs, int[] labels, int epochs) {
        for (int epoch = 0; epoch < epochs; epoch++) {
            for (int i = 0; i < inputs.length; i++) {
                forward(inputs[i]);
                backward(inputs[i], labels[i]);
            }
        }
    }

    private void forward(double[] input) {
        // Input to hidden layer
        for (int j = 0; j < hiddenSize; j++) {
            hiddenLayer[j] = 0;
            for (int i = 0; i < inputSize; i++) {
                hiddenLayer[j] += input[i] * weightsInputHidden[i][j];
            }
            hiddenLayer[j] = sigmoid(hiddenLayer[j]);
        }

        // Hidden to output layer
        for (int j = 0; j < outputSize; j++) {
            outputLayer[j] = 0;
            for (int i = 0; i < hiddenSize; i++) {
                outputLayer[j] += hiddenLayer[i] * weightsHiddenOutput[i][j];
            }
            outputLayer[j] = sigmoid(outputLayer[j]);
        }
    }

    private void backward(double[] input, int label) {
        double[] outputError = new double[outputSize];
        double[] hiddenError = new double[hiddenSize];

        // Calculate output layer error
        for (int j = 0; j < outputSize; j++) {
            double target = (j == label) ? 1.0 : 0.0;
            outputError[j] = (target - outputLayer[j]) * sigmoidDerivative(outputLayer[j]);
        }

        // Calculate hidden layer error
        for (int i = 0; i < hiddenSize; i++) {
            hiddenError[i] = 0;
            for (int j = 0; j < outputSize; j++) {
                hiddenError[i] += outputError[j] * weightsHiddenOutput[i][j];
            }
            hiddenError[i] *= sigmoidDerivative(hiddenLayer[i]);
        }

        // Update weights (hidden to output)
        for (int i = 0; i < hiddenSize; i++) {
            for (int j = 0; j < outputSize; j++) {
                weightsHiddenOutput[i][j] += learningRate * outputError[j] * hiddenLayer[i];
            }
        }

        // Update weights (input to hidden)
        for (int i = 0; i < inputSize; i++) {
            for (int j = 0; j < hiddenSize; j++) {
                weightsInputHidden[i][j] += learningRate * hiddenError[j] * input[i];
            }
        }
    }

    public int predict(double[] input) {
        forward(input);
        int prediction = 0;
        double maxOutput = outputLayer[0];
        for (int i = 1; i < outputSize; i++) {
            if (outputLayer[i] > maxOutput) {
                maxOutput = outputLayer[i];
                prediction = i;
            }
        }
        return prediction;
    }

    private double sigmoid(double x) {
        return 1 / (1 + Math.exp(-x));
    }

    private double sigmoidDerivative(double x) {
        return x * (1 - x);
    }
    public double[] predictProbabilities(double[] input) {
        // Forward pass: Input to Hidden Layer
        double[] hiddenLayer = new double[hiddenSize];
        for (int j = 0; j < hiddenSize; j++) {
            hiddenLayer[j] = 0;
            for (int i = 0; i < inputSize; i++) {
                hiddenLayer[j] += input[i] * weightsInputHidden[i][j];
            }
            hiddenLayer[j] = sigmoid(hiddenLayer[j]);
        }
    
        // Forward pass: Hidden to Output Layer
        double[] outputLayer = new double[outputSize];
        for (int j = 0; j < outputSize; j++) {
            outputLayer[j] = 0;
            for (int i = 0; i < hiddenSize; i++) {
                outputLayer[j] += hiddenLayer[i] * weightsHiddenOutput[i][j];
            }
            outputLayer[j] = sigmoid(outputLayer[j]); // Apply activation function
        }
    
        // Return output layer as probabilities
        return outputLayer;
    }
}
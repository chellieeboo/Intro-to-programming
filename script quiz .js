// Quiz questions array
const quizQuestions = [
    {
        question: "Ano ang JavaScript?",
        options: [
            "Isang programming language para sa web",
            "Isang type ng kape",
            "Isang movie title",
            "Isang brand ng sapatos"
        ],
        correct: 0
    },
    {
        question: "Paano mag-declare ng variable sa JavaScript?",
        options: [
            "var myVar;",
            "variable myVar;",
            "string myVar;",
            "let variable = myVar;"
        ],
        correct: 0
    },
    {
        question: "Ano ang ginagawa ng 'console.log()'?",
        options: [
            "Nagpi-print ng message sa console",
            "Gumagawa ng log file",
            "Nagre-restart ng computer",
            "Nagdi-display ng alert box"
        ],
        correct: 0
    },
    {
        question: "Ano ang output ng: console.log(2 + '2')?",
        options: [
            "'22'",
            "4",
            "NaN",
            "Error"
        ],
        correct: 0
    },
    {
        question: "Ano ang JavaScript framework?",
        options: [
            "React, Vue, Angular",
            "Java, Python, C++",
            "HTML, CSS, PHP",
            "Windows, MacOS, Linux"
        ],
        correct: 0
    }
];

// Game state variables
let currentQuestion = 0;
let score = 0;
let selectedAnswer = null;

// DOM Elements
const startScreen = document.getElementById('start-screen');
const quizScreen = document.getElementById('quiz-screen');
const resultScreen = document.getElementById('result-screen');
const questionElement = document.getElementById('question');
const optionsElement = document.getElementById('options');
const questionCounter = document.getElementById('question-counter');
const scoreElement = document.getElementById('score');
const nextButton = document.getElementById('next-btn');
const finalScoreElement = document.getElementById('final-score');

// Function to start the quiz
function startQuiz() {
    startScreen.classList.add('hidden');
    quizScreen.classList.remove('hidden');
    showQuestion();
}

// Function to display current question
function showQuestion() {
    // Reset selected answer and next button
    selectedAnswer = null;
    nextButton.classList.add('hidden');
    
    // Get current question data
    const question = quizQuestions[currentQuestion];
    
    // Update question counter and score
    questionCounter.textContent = `Question: ${currentQuestion + 1}/${quizQuestions.length}`;
    scoreElement.textContent = `Score: ${score}`;
    
    // Display question
    questionElement.textContent = question.question;
    
    // Clear previous options
    optionsElement.innerHTML = '';
    
    // Create and display options
    question.options.forEach((option, index) => {
        const optionElement = document.createElement('div');
        optionElement.className = 'option';
        optionElement.textContent = option;
        optionElement.onclick = () => selectAnswer(index);
        optionsElement.appendChild(optionElement);
    });
}

// Function to handle answer selection
function selectAnswer(index) {
    if (selectedAnswer !== null) return; // Prevent multiple selections
    
    selectedAnswer = index;
    const question = quizQuestions[currentQuestion];
    const options = document.querySelectorAll('.option');
    
    // Disable all options after selection
    options.forEach(option => {
        option.style.cursor = 'not-allowed';
    });
    
    // Check if answer is correct
    if (index === question.correct) {
        options[index].classList.add('correct');
        score++;
        scoreElement.textContent = `Score: ${score}`;
    } else {
        options[index].classList.add('wrong');
        // Show correct answer
        options[question.correct].classList.add('correct');
    }
    
    // Show next button
    nextButton.classList.remove('hidden');
}

// Function to move to next question
function nextQuestion() {
    currentQuestion++;
    
    if (currentQuestion < quizQuestions.length) {
        showQuestion();
    } else {
        showResults();
    }
}

// Function to show final results
function showResults() {
    quizScreen.classList.add('hidden');
    resultScreen.classList.remove('hidden');
    finalScoreElement.textContent = `Your final score: ${score}/${quizQuestions.length}`;
}

// Function to restart the quiz
function restartQuiz() {
    currentQuestion = 0;
    score = 0;
    selectedAnswer = null;
    
    resultScreen.classList.add('hidden');
    startScreen.classList.remove('hidden');
}
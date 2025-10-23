// Kumuha ng mga elements mula sa HTML
const taskInput = document.getElementById('taskInput');
const taskList = document.getElementById('taskList');

// Function para mag-add ng bagong task
function addTask() {
    const taskText = taskInput.value.trim();

    // Validation: Check kung may laman ang input
    if (taskText === '') {
        alert('Please enter a task!');
        return;
    }

    // Gumawa ng bagong <li> element
    const li = document.createElement('li');

    // Lagyan ng laman ang <li> gamit ang input value
    li.innerHTML = `
        <span>${taskText}</span>
        <button class="delete-btn" onclick="removeTask(this)">Delete</button>
    `;

    // Idagdag ang <li> sa <ul>
    taskList.appendChild(li);

    // I-clear ang input field
    taskInput.value = '';
}

// Function para mag-delete ng task
function removeTask(button) {
    // Kuhanin ang parent element (<li>) ng delete button
    const li = button.parentElement;
    
    // I-remove ang <li> mula sa list
    taskList.removeChild(li);
}

// Optional: Pwede mag-add gamit ang Enter key
taskInput.addEventListener('keypress', function(event) {
    if (event.key === 'Enter') {
        addTask();
    }
});
const form = document.getElementById('fr');
const nameInput = document.getElementById('name');
const emailInput = document.getElementById('email');
const passwordInput = document.getElementById('password');
const confirmPasswordInput = document.getElementById('cnfrmPwd');
const errorsDiv = document.getElementById('errorsDiv');


function toggleForm() {
    form.classList.toggle('hide');
}
document.getElementById("btn1").addEventListener('click', toggleForm);


function isValidName(name) {
    return /^[A-Za-z ]{3,}$/.test(name);
}


function isValidEmail(email) {
    return /^[^\s@]+@[^\s@]+\.[^\s@]+$/.test(email);
}


function isStrongPassword(password) {
    return /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d).{8,}$/.test(password);
}

function submitLogic(e) {
    e.preventDefault();
    errorsDiv.innerHTML = "";
    let hasError = false;

    if (nameInput.value.trim() === '') {
        appendError("Name is required");
        hasError = true;
    } else if (!isValidName(nameInput.value.trim())) {
        appendError("Name must be at least 3 letters and contain only letters and spaces");
        hasError = true;
    }
    if (emailInput.value.trim() === "") {
        appendError("Email is required");
        hasError = true;
    } else if (!isValidEmail(emailInput.value.trim())) {
        appendError("Email is not valid");
        hasError = true;
    }
    if (passwordInput.value.trim() === "") {
        appendError("Password is required");
        hasError = true;
    } else if (!isStrongPassword(passwordInput.value.trim())) {
        appendError("Password must be at least 8 characters, include uppercase, lowercase, and a number");
        hasError = true;
    }
    if (confirmPasswordInput.value.trim() === "") {
        appendError("Confirm Password is required");
        hasError = true;
    } else if (passwordInput.value.trim() !== confirmPasswordInput.value.trim()) {
        appendError("Passwords do not match");
        hasError = true;
    }

    
    if (!hasError) {
        const p = document.createElement('p');
        p.textContent = "Registration successful!";
        p.style.color = "green";
        p.style.fontWeight = "bold";
        errorsDiv.append(p);
        form.reset();
        form.classList.add('hide');
    }
}

function appendError(msg) {
    const p = document.createElement('p');
    p.textContent = msg;
    p.style.color = "red";
    errorsDiv.append(p);
}

form.addEventListener('submit', submitLogic);


document.getElementById('showPwd').addEventListener('click', function () {
    passwordInput.type = passwordInput.type === 'password' ? 'text' : 'password';
    this.textContent = passwordInput.type === 'password' ? 'Show' : 'Hide';
});
document.getElementById('showCnfrmPwd').addEventListener('click', function () {
    confirmPasswordInput.type = confirmPasswordInput.type === 'password' ? 'text' : 'password';
    this.textContent = confirmPasswordInput.type === 'password' ? 'Show' : 'Hide';
});


nameInput.addEventListener('input', () => {
    if (!isValidName(nameInput.value.trim())) {
        nameInput.style.borderColor = 'red';
    } else {
        nameInput.style.borderColor = '';
    }
});
emailInput.addEventListener('input', () => {
    if (!isValidEmail(emailInput.value.trim())) {
        emailInput.style.borderColor = 'red';
    } else {
        emailInput.style.borderColor = '';
    }
});
passwordInput.addEventListener('input', () => {
    if (!isStrongPassword(passwordInput.value.trim())) {
        passwordInput.style.borderColor = 'red';
    } else {
        passwordInput.style.borderColor = '';
    }
});
confirmPasswordInput.addEventListener('input', () => {
    if (passwordInput.value.trim() !== confirmPasswordInput.value.trim()) {
        confirmPasswordInput.style.borderColor = 'red';
    } else {
        confirmPasswordInput.style.borderColor = '';
    }
});
const form = document.getElementById('fr');
const nameInput = document.getElementById('name');
const emailInput = document.getElementById('email');
const passwordInput = document.getElementById('password');
const ConfirmPassword = document.getElementById('cnfrmPwd');
function add(){
    form.classList.toggle('hide')
    
}
document.getElementById("btn1").addEventListener('click',add);


function submitLogic(e){

    e.preventDefault();
    errorsDiv.textContent = "";
    if(nameInput.value.trim() == ''){
        const p = document.createElement('p');
        p.textContent = "name is required";
        errorsDiv.append(p);
    }
    if(emailInput.value.trim() == ""){
        const p = document.createElement('p');
        p.textContent = "email is required";
        errorsDiv.append(p);
    }
    if(passwordInput.value.trim().length <=8){
        const p = document.createElement('p');
        p.textContent = "Password should be atleat 8 charaters";
        errorsDiv.append(p);
    }
    if(passwordInput.value.trim() == ""){
        const p = document.createElement('p');
        p.textContent = "Password is required";
        errorsDiv.append(p);
    }
    if(passwordInput.value!=''&& passwordInput.value.trim() == ""){
        const p = document.createElement('p');
        p.textContent = "Password is required";
        errorsDiv.append(p);
    }
    if(ConfirmPassword.value.trim() == ""){

        const p = document.createElement('p');
        p.textContent = "ConfirmPassword is required";
        errorsDiv.append(p);
    }
}
document.getElementById('fr').addEventListener('submit',submitLogic);

document.getElementById('showPwd').addEventListener('click',function(){
    passwordInput.type = passwordInput.type == 'password' ? 'text' : 'password';
})


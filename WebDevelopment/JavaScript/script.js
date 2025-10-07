console.log("hello world");

// let x = +prompt("Enter a value");
// console.log((x % 2 == 0 && "Even") || "ODD");

// let a = +prompt("Enter A value");
// let b = +prompt("Enter B value");
// console.log((a>b&&`Max = ${a}`)||`Max = ${b}`);

// let a = +prompt("Enter A value");
// let b = +prompt("Enter B value");
// let c = +prompt("Enter C value");
// console.log((a>b&& a>c&&`Max = ${a}`)||(b>a&&b>c&&`Max = ${b}`)||`Max = ${c}`);

// let account = prompt("enter true or false");
// if(account){
//     console.log("Your account is active. You can proceed with your transaction.")
// }
// else{
//     console.log("Your account is currently inactive. Please contact support.")
// }

// let x = +prompt("enter value");

// while(x){
//     console.log(x--);
// }

/*

    login attempts

*/
// let attempts = 3;
// let isLoggedIn = false;
// let correctPassword = "Secret123";

// while (attempts >=0 && isLoggedIn != true) {
//   let enterPassword = prompt(`Enter your password.(${attempts} attempts left)`);

//   if(attempts == 0){
//     console.log("Incorrect password. No attempts left.Account locked.");
//     break;
//   }

//   if (enterPassword === correctPassword) {
//     console.log("Login successful!");
//     isLoggedIn = true;
//     break;
//   } else {
//     attempts--;
//     console.log("Incorrect password. (Please try again)")
//   }
// }





// let n = +prompt("Enter array size");
// let number = [];
// for (let i = 0; i < n; i++) {
//   let num = +prompt("enter values:");
//   number.push(num);
// }

// console.log(number);

// let number = [24, 45, 65, 34, 64];
// console.log(number);

// for (let i = 0; i < number.length - 1; i++) {
//   let minindex = i;
//   for (let j = i + 1; j < number.length; j++) {
//     if (number[j] < number[minindex]) {
//       minindex = j;
//     }
//   }
//   let temp = number[i];
//   number[i] = number[minindex];
//   number[minindex] = temp;
// }
// console.log(number);










// let c = 0;
// let ele=  document.getElementById('count')
// function incr ()
// {
//     c++;
//    ele.textContent = c;  
// }
// function decr ()
// {
//     if (c > 0)
//     {
//         c--
//                 ele.textContent = c
//     }  
//     else
//     {
//         alert("number should not be less than zero");
//     }
// }
// function reset() {
//     c = 0;
//     ele.textContent = c
// }
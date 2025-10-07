// const names = document.getElementById('name');
// const age = document.getElementById('age');
// const email = document.getElementById('email');
// const submitBtn = document.getElementById('submitBtn');



// function display() {
//     document.getElementById('profile').innerHTML = `
//         <p>Name: ${names.value}</p>
//         <p>Age: ${age.value}</p>
//         <p>Email: ${email.value}</p>
//         <hr>
//     `;
// }

// submitBtn.addEventListener('click', display);



const submitBtn = document.getElementById('submitBtn');
const text = document.getElementById('text');

function display() {
    const input = text.value.toLowerCase();
    let vowels = 0;
    let consonants = 0;

    for (let i = 0; i < input.length; i++) {
        const ch = input[i];
        if (ch >= 'a' && ch <= 'z') {
            if ('aeiou'.includes(ch)) {
                vowels++;
            } else {
                consonants++;
            }
        }
    }

    document.getElementById('profile').innerHTML = `<p>Vowels = ${vowels}</p>
    <p>Consonants = ${consonants}</p>`;
}

submitBtn.addEventListener('click', display);






function diaplaymovies(){
    movies.forEach(e,i) => {
        const movieDiv = document.createElement("div")
        movieDiv.classList.add("movies")

        const image = document.createElement('image');
    }
}
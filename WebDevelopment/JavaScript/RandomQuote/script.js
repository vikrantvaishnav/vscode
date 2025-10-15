const quotes = [
    { q: "Success is liking yourself, liking what you do, and liking how you do it.", a: "Maya Angelou" },
    { q: "Difficult roads often lead to beautiful destinations.", a: "Unknown" },
    { q: "All human wisdom is contained in these two words - Wait and Hope", a: "Alexandre Dumas" },
    { q: "Good judgment comes from experience, and experience comes from bad judgment.", a: "Rita Mae Brown" },
    { q: "Give out what you most want to come back.", a: "Robin Sharma" },
    { q: "Youth ages, immaturity is outgrown, ignorance can be educated, and drunkenness sobered, but stupid lasts forever.", a: "Aristophanes" },
    { q: "Whatever you believe with feeling becomes your reality. ", a: "Brian Tracy" },
    { q: "He who cheats the earth will be cheated by the earth.", a: "Chinese Proverb" },
    { q: "It does not do to dwell on dreams and forget to live, remember that.", a: "Albus Dumbledore" },
    { q: "Behind every beautiful thing, there's some kind of pain.", a: "Bob Dylan" },
    { q: "Concentrated power has always been the enemy of liberty.", a: "Ronald Reagan" },
    { q: "Life is too important to be taken seriously.", a: "Oscar Wilde" },
    { q: "The enemy is a very good teacher.", a: "Dalai Lama" },
    { q: "The degree of responsibility you take for your life determines how much change you can create in it.", a: "Celestine Chua" },
    { q: "Just do the best you can. No one can do more than that.", a: "John Wooden" },
    { q: "Unless someone truly has the power to say no, they never truly have the power to say yes.", a: "Dan Millman" },
    { q: "The greatest gift that you can give to others is the gift of unconditional love and acceptance. ", a: "Brian Tracy" },
    { q: "It is useless to meet revenge with revenge; it will heal nothing.", a: "J.R.R. Tolkien" },
    { q: "Every hour of every day is an unspeakably perfect miracle.", a: "Walt Whitman" },
    { q: "We think too much and feel too little.", a: "Charlie Chaplin" },
    { q: "If they wrote it to make money, don't read it.", a: "Naval Ravikant" },
    { q: "People inspire you, or they drain you. Pick them wisely.", a: "Les Brown" },
    { q: "Life is a long lesson in humility. ", a: "James Matthew Barrie" },
    { q: "If you're not failing every now and again, it's a sign you're not doing anything very innovative.", a: "Woody Allen" },
    { q: "There's no coming to consciousness without pain", a: "Carl Jung" },
    { q: "The person who says something is impossible should not interrupt the person who is doing it.", a: "Chinese Proverb" },
    { q: "May you find grace as you surrender to life. May you find happiness, as you stop seeking it.", a: "Dan Millman" },
    { q: "The salvation of the world lies in the human heart.", a: "Vaclav Havel" },
    { q: "The greatest of all mistakes is to do nothing because you think you can only do a little.  ", a: "Zig Ziglar" },
    { q: "Believe that life is worth living and your belief will help create the fact.", a: "William James" },
    { q: "A crisis is an opportunity riding the dangerous wind.", a: "Chinese Proverb" },
    { q: "If you put yourself in a position where you have to stretch outside your comfort zone, then you are forced to expand your consciousness.", a: "Unknown" },
    { q: "I do not exist to impress the world. I exist to live my life in a way that will make me happy.", a: "Richard Bach" },
    { q: "Life is what you make it. Always has been, always will be.", a: "Eleanor Roosevelt" },
    { q: "If you need inspiration, don't do it.", a: "Elon Musk" },
    { q: "Good, better, best. Never let it rest. 'Til your good is better and your better is best. ", a: "St. Jerome" },
    { q: "The quality of your life is determined by the quality of questions you ask.", a: "Tony Robbins" },
    { q: "How you think when you lose determines how long it will be until you win.", a: "Gilbert Chesterton" },
    { q: "Action is the foundational key to all success.", a: "Pablo Picasso" },
    { q: "As a man thinketh in his heart, so shall he be.", a: "James Allen" },
    { q: "Know the rules well, so you can break them effectively.", a: "Dalai Lama" },
    { q: "If you can't feed a hundred people, then feed just one.", a: "Mother Teresa" },
    { q: "Learn to use your emotions to think, not think with your emotions.", a: "Robert Kiyosaki" },
    { q: "Enjoy life. There's plenty of time to be dead.", a: "Hans Christian Andersen" },
    { q: "If no one ever broke the rules, then we'd never advance.", a: "Simon Sinek" },
    { q: "Always do your best. What you plant now, you will harvest later.", a: "Og Mandino" },
    { q: "Your home is where your thoughts find peace.", a: "Zen Proverb" },
    { q: "Adventure is worthwhile in itself.", a: "Amelia Earhart" },
    { q: "There is an essence of when you are fearless, you become more creative.", a: "Gurbaksh Chahal" },
    { q: "The way to love anything is to realize that it may be lost.", a: "Gilbert Chesterton" }
];

const quoteText = document.getElementById('quoteText');
const quoteAuthor = document.getElementById('quoteAuthor');
const newQuoteBtn = document.getElementById('newQuoteBtn');

function showRandomQuote() {
    const random = Math.floor(Math.random() * quotes.length);
    quoteText.textContent = quotes[random].q;
    quoteAuthor.textContent = "- " + quotes[random].a;
}

newQuoteBtn.addEventListener('click', showRandomQuote);
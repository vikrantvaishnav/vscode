const colorButtons = document.querySelectorAll(".color");
const body = document.body;

colorButtons.forEach(btn => {
  btn.addEventListener("click", () => {
    const color = btn.getAttribute("data-color");
    body.style.backgroundColor = color;
  });
});

/** Fetches the current date from the server and adds it to the page. */
async function showPhrase() {
  const responseFromServer = await fetch('/phrase');
  const phrases = await responseFromServer.json();

  const phraseContainer = document.getElementById('phrase-container');
  const randomText = phrases[Math.floor(Math.random() * phrases.length)];
  phraseContainer.innerText = randomText;
}
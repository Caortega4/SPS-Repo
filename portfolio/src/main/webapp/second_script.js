/** Fetches the current date from the server and adds it to the page. */
async function showPhrase() {
  const responseFromServer = await fetch('/phrase');
  const textFromResponse = await responseFromServer.text();

  const phraseContainer = document.getElementById('phrase-container');
  phraseContainer.innerText = textFromResponse;
}
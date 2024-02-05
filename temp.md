

1. Chiamata rest per ottenere i dati del labirinto (lunghezza, altezza, punto di inizio)
2. Crea una matrice per salvare le celle del labirinto controllate
3. Esegue in loop le seguenti azioni fino a quando non trova la coppa
  - Si guarda intorno e salva i dati delle celle nella matrice
  - Avanza verso le caselle insesplorate preferendo le caselle in ordine antiorario partendo da destra
    - Se trova un vicolo cieco torna indietro per le caselle esplorate fino a quando non ritrova una casella inesplorata
4. Siamo finiti sulla coppa, con i dati salvati sulla matrice calcoliamo il percorso più corto usando le informazioni scritte dalla matrice

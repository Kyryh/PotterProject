## Inizializzazione del programma
1. Crea le componenti grafiche che ci permetteranno di visualizzare ed esplorare il labirinto
    - Se siamo nella versione di debug mostriamo i bottoni per il movimento, il load e l'unload


## Bottone start
1. Accetta opzionalmente un seed dal textfield
2. Fa la chiamata rest per inizializzare il labirinto e visualizzarlo usando i dati ottenuti (lunghezza, altezza, punto di inizio)
3. Abilitiamo l'algoritmo per l'esplorazione del labirinto se non siamo nella versione di debug


## Bottoni per il movimento
1. Fa la chiamata rest per il movimento nella direzione selezionata
2. Fa automaticamente la chiamata rest per vedere le celle vicine dopo il movimento dato che non usa energia


## Bottone per il load
1. Fa la chiamata rest per il load


## Bottone per l'unload
1. Fa la chiamata rest per l'unload
2. Messaggio che informa l'utente della vittoria


## Algoritmo per l'esplorazione del labirinto
1. Crea una matrice per salvare le celle del labirinto controllate
2. Esegue in loop le seguenti azioni fino a quando non trova la coppa
    - Si guarda intorno e salva i dati delle celle nella matrice
    - Avanza verso le caselle insesplorate preferendo le caselle in ordine antiorario partendo da destra
      - Se trova un vicolo cieco torna indietro per le caselle esplorate fino a quando non ritrova una casella inesplorata
3. Siamo finiti sulla coppa, con i dati salvati sulla matrice calcoliamo il percorso più corto

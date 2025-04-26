CREATE DATABASE progetto_squadre;

CREATE TABLE campionato (
    id_campionato SERIAL PRIMARY KEY,
    nome_torneo VARCHAR(255) NOT NULL,
    premio_primo_posto DECIMAL(10, 2) NOT NULL,
    premio_secondo_posto DECIMAL(10, 2) NOT NULL,
    premio_terzo_posto DECIMAL(10, 2) NOT NULL,
    premio_base_partecipazione DECIMAL(10, 2) NOT NULL
);

CREATE TABLE campionato_in_corso (
    id SERIAL PRIMARY KEY,
    id_campionato INTEGER NOT NULL,
    id_squadra INTEGER NOT NULL,
    FOREIGN KEY (id_campionato) REFERENCES campionato(id_campionato) ON DELETE CASCADE,
    FOREIGN KEY (id_squadra) REFERENCES squadre(id) ON DELETE CASCADE
);

CREATE TABLE squadre (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    numero_giocatori INTEGER NOT NULL,
    budget_annuale DECIMAL(15, 2) NOT NULL,
    vittorie INTEGER DEFAULT 0,
    sconfitte INTEGER DEFAULT 0,
    pareggio INTEGER DEFAULT 0
);

CREATE TABLE giocatori (
    id_giocatore SERIAL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    cognome VARCHAR(100) NOT NULL,
    data_nascita DATE NOT NULL,
    ruolo VARCHAR(50),
    id_squadra INTEGER NOT NULL,
    stipendio DECIMAL(10, 2),
    numero_maglia INTEGER,
    FOREIGN KEY (id_squadra) REFERENCES squadre(id) ON DELETE CASCADE
);

CREATE TABLE trasferimenti (
    id SERIAL PRIMARY KEY,
    stipendio_giocatore DECIMAL(10, 2) NOT NULL,
    budget_squadra_fornisce DECIMAL(15, 2) NOT NULL,
    budget_squadra_cliente DECIMAL(15, 2) NOT NULL,
    prezzo_trasferimento DECIMAL(15, 2) NOT NULL
);

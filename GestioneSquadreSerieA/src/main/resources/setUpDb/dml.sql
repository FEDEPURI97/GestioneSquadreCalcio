INSERT INTO
  public.squadre (
    id,
    nome,
    numero_giocatori,
    budget_annuale,
    vittorie,
    sconfitte,
    pareggio
  )
VALUES
  (1, 'Juventus', 25, 280, 1, 18, 3),
  (4, 'Napoli', 25, 210, 2, 15, 5),
  (5, 'Roma', 25, 200, 12, 5, 5),
  (6, 'Lazio', 24, 180, 13, 9, 0),
  (7, 'Atalanta', 23, 150, 12, 2, 8),
  (8, 'Fiorentina', 24, 140, 15, 2, 5),
  (9, 'Torino', 25, 110, 1, 21, 0),
  (10, 'Bologna', 24, 100, 16, 6, 0),
  (11, 'Monza', 25, 95, 2, 19, 1),
  (12, 'Sassuolo', 24, 90, 1, 19, 1);

INSERT INTO
  public.squadre (
    id,
    nome,
    numero_giocatori,
    budget_annuale,
    vittorie,
    sconfitte,
    pareggio
  )
VALUES
  (13, 'Lecce', 25, 70, 16, 1, 5),
  (14, 'Genoa', 24, 85, 1, 18, 3),
  (15, 'Cagliari', 25, 75, 3, 16, 3),
  (16, 'Empoli', 24, 60, 3, 15, 4),
  (17, 'Udinese', 25, 80, 2, 18, 0),
  (18, 'Verona', 24, 65, 5, 16, 0),
  (19, 'Frosinone', 25, 55, 0, 20, 2),
  (20, 'Salernitana', 24, 50, 1, 6, 5),
  (2, 'Inter', 28, 260, 1, 10, 11),
  (3, 'Milan', 26, 240, 20, 0, 0);

INSERT INTO
  public.campionato (
    nome_torneo,
    premio_primo_posto,
    premio_secondo_posto,
    premio_terzo_posto,
    premio_base_partecipazione
  )
VALUES
  (
    'Serie A',
    10000000,
    5000000,
    2500000,
    '1000000.00'
  ),
  (
    'Coppa Italia',
    2000000,
    1000000,
    500000,
    '500000.00'
  );

INSERT INTO
  public.campionato_in_corso (id_campionato, id_squadra)
VALUES
  (1, 1),
  (1, 20),
  (1, 16),
  (1, 19),
  (1, 9),
  (1, 8),
  (1, 13),
  (1, 14),
  (1, 10),
  (1, 11);

INSERT INTO
  public.campionato_in_corso (id_campionato, id_squadra)
VALUES
  (1, 15),
  (1, 17),
  (1, 18),
  (1, 6),
  (1, 4),
  (1, 7),
  (1, 12),
  (1, 5),
  (1, 3),
  (1, 2);

INSERT INTO
  public.giocatori (
    nome,
    cognome,
    data_nascita,
    ruolo,
    id_squadra,
    stipendio,
    numero_maglia
  )
VALUES
  (
    'Wojciech',
    'Szczesny',
    '1990-04-18 00:00:00',
    'Portiere',
    1,
    6000000,
    1
  ),
  (
    'Leonardo',
    'Bonucci',
    '1987-05-01 00:00:00',
    'Difensore',
    1,
    8000000,
    19
  ),
  (
    'Giorgio',
    'Chiellini',
    '1984-08-14 00:00:00',
    'Difensore',
    1,
    9000000,
    3
  ),
  (
    'Matthijs',
    'de Ligt',
    '1999-08-12 00:00:00',
    'Difensore',
    1,
    7000000,
    4
  ),
  (
    'Alex',
    'Sandro',
    '1991-01-26 00:00:00',
    'Difensore',
    1,
    6000000,
    12
  ),
  (
    'Danilo',
    'Luiz da Silva',
    '1991-07-15 00:00:00',
    'Difensore',
    1,
    5500000,
    6
  ),
  (
    'Juan',
    'Cuadrado',
    '1988-05-26 00:00:00',
    'Centrocampista',
    1,
    7000000,
    11
  ),
  (
    'Adrien',
    'Rabiot',
    '1995-04-03 00:00:00',
    'Centrocampista',
    1,
    7000000,
    25
  ),
  (
    'Aaron',
    'Ramsey',
    '1990-12-26 00:00:00',
    'Centrocampista',
    1,
    8000000,
    8
  ),
  (
    'Rodrigo',
    'Bentancur',
    '1997-06-25 00:00:00',
    'Centrocampista',
    1,
    6000000,
    30
  );

INSERT INTO
  public.giocatori (
    nome,
    cognome,
    data_nascita,
    ruolo,
    id_squadra,
    stipendio,
    numero_maglia
  )
VALUES
  (
    'Federico',
    'Chiesa',
    '1997-10-25 00:00:00',
    'Attaccante',
    1,
    5000000,
    22
  ),
  (
    'Cristiano',
    'Ronaldo',
    '1985-02-05 00:00:00',
    'Attaccante',
    1,
    31000000,
    7
  ),
  (
    'Paulo',
    'Dybala',
    '1993-11-15 00:00:00',
    'Attaccante',
    1,
    9000000,
    10
  ),
  (
    'Alvaro',
    'Morata',
    '1992-10-23 00:00:00',
    'Attaccante',
    1,
    7000000,
    9
  ),
  (
    'Federico',
    'Bernardeschi',
    '1994-02-16 00:00:00',
    'Attaccante',
    1,
    5000000,
    20
  ),
  (
    'Dejan',
    'Kulusevski',
    '2000-04-25 00:00:00',
    'Attaccante',
    1,
    4000000,
    44
  ),
  (
    'Matias',
    'Vega',
    '1997-02-05 00:00:00',
    'Centrocampista',
    1,
    3500000,
    27
  ),
  (
    'Merih',
    'Demiral',
    '1998-05-05 00:00:00',
    'Difensore',
    1,
    6000000,
    28
  ),
  (
    'Arthur',
    'Melo',
    '1996-08-12 00:00:00',
    'Centrocampista',
    1,
    5000000,
    29
  ),
  (
    'Mattia',
    'De Sciglio',
    '1992-10-20 00:00:00',
    'Difensore',
    1,
    3500000,
    2
  );

INSERT INTO
  public.giocatori (
    nome,
    cognome,
    data_nascita,
    ruolo,
    id_squadra,
    stipendio,
    numero_maglia
  )
VALUES
  (
    'Blaise',
    'Matuidi',
    '1987-04-09 00:00:00',
    'Centrocampista',
    1,
    7000000,
    14
  ),
  (
    'Cristiano',
    'Ronaldo',
    '1985-02-05 00:00:00',
    'Attaccante',
    1,
    31000000,
    7
  ),
  (
    'Nicolo',
    'Rovella',
    '2001-02-04 00:00:00',
    'Centrocampista',
    1,
    2500000,
    16
  ),
  (
    'Samuele',
    'Ricci',
    '2000-02-19 00:00:00',
    'Centrocampista',
    1,
    2700000,
    18
  ),
  (
    'Andrea',
    'Pian',
    '1990-11-04 00:00:00',
    'Centrocampista',
    1,
    4800000,
    17
  ),
  (
    'Federico',
    'Gatti',
    '1998-05-03 00:00:00',
    'Difensore',
    1,
    3000000,
    15
  ),
  (
    'Mike',
    'Maignan',
    '1995-07-03 00:00:00',
    'Portiere',
    3,
    3200000,
    16
  ),
  (
    'Davide',
    'Calabria',
    '1996-12-06 00:00:00',
    'Difensore',
    3,
    2000000,
    2
  ),
  (
    'Fikayo',
    'Tomori',
    '1997-12-19 00:00:00',
    'Difensore',
    3,
    2500000,
    23
  ),
  (
    'Malick',
    'Thiaw',
    '2001-08-08 00:00:00',
    'Difensore',
    3,
    1800000,
    28
  );

INSERT INTO
  public.giocatori (
    nome,
    cognome,
    data_nascita,
    ruolo,
    id_squadra,
    stipendio,
    numero_maglia
  )
VALUES
  (
    'Theo',
    'Hernandez',
    '1997-10-06 00:00:00',
    'Difensore',
    3,
    4000000,
    19
  ),
  (
    'Pierre',
    'Kalulu',
    '2000-06-05 00:00:00',
    'Difensore',
    3,
    1500000,
    20
  ),
  (
    'Simon',
    'Kjaer',
    '1989-03-26 00:00:00',
    'Difensore',
    3,
    2200000,
    24
  ),
  (
    'Alessandro',
    'Florenzi',
    '1991-03-11 00:00:00',
    'Difensore',
    3,
    1800000,
    25
  ),
  (
    'Ismael',
    'Bennacer',
    '1997-12-01 00:00:00',
    'Centrocampista',
    3,
    2300000,
    4
  ),
  (
    'Ruben',
    'Loftus-Cheek',
    '1996-01-23 00:00:00',
    'Centrocampista',
    3,
    3500000,
    8
  ),
  (
    'Tijjani',
    'Reijnders',
    '1998-07-29 00:00:00',
    'Centrocampista',
    3,
    2200000,
    14
  ),
  (
    'Yacine',
    'Adli',
    '2000-07-29 00:00:00',
    'Centrocampista',
    3,
    1200000,
    7
  ),
  (
    'Tommaso',
    'Pobega',
    '1999-07-15 00:00:00',
    'Centrocampista',
    3,
    1500000,
    32
  ),
  (
    'Noah',
    'Okafor',
    '2000-05-24 00:00:00',
    'Attaccante',
    3,
    2000000,
    17
  );

INSERT INTO
  public.giocatori (
    nome,
    cognome,
    data_nascita,
    ruolo,
    id_squadra,
    stipendio,
    numero_maglia
  )
VALUES
  (
    'Luka',
    'Jovic',
    '1997-12-23 00:00:00',
    'Attaccante',
    3,
    2100000,
    15
  ),
  (
    'Olivier',
    'Giroud',
    '1986-09-30 00:00:00',
    'Attaccante',
    3,
    3700000,
    9
  ),
  (
    'Christian',
    'Pulisic',
    '1998-09-18 00:00:00',
    'Attaccante',
    3,
    3500000,
    11
  ),
  (
    'Samuel',
    'Chukwueze',
    '1999-05-22 00:00:00',
    'Attaccante',
    3,
    2500000,
    21
  ),
  (
    'Rafael',
    'Leao',
    '1999-06-10 00:00:00',
    'Attaccante',
    3,
    5000000,
    10
  ),
  (
    'Antonio',
    'Mirante',
    '1983-07-08 00:00:00',
    'Portiere',
    3,
    800000,
    83
  ),
  (
    'Marco',
    'Sportiello',
    '1992-05-10 00:00:00',
    'Portiere',
    3,
    1000000,
    57
  ),
  (
    'Filippo',
    'Terracciano',
    '2003-02-15 00:00:00',
    'Difensore',
    3,
    900000,
    38
  ),
  (
    'Jan-Carlo',
    'Simic',
    '2005-05-02 00:00:00',
    'Difensore',
    3,
    600000,
    80
  ),
  (
    'Alexis',
    'Saelemaekers',
    '1999-06-27 00:00:00',
    'Centrocampista',
    3,
    1900000,
    56
  );

INSERT INTO
  public.giocatori (
    nome,
    cognome,
    data_nascita,
    ruolo,
    id_squadra,
    stipendio,
    numero_maglia
  )
VALUES
  (
    'Matteo',
    'Gabbia',
    '1999-10-21 00:00:00',
    'Difensore',
    3,
    1000000,
    46
  ),
  (
    'Chaka',
    'Traorè',
    '2004-12-23 00:00:00',
    'Attaccante',
    3,
    700000,
    70
  ),
  (
    'Alex',
    'Meret',
    '1997-03-22 00:00:00',
    'Portiere',
    4,
    1200000,
    1
  ),
  (
    'Giovanni',
    'Di Lorenzo',
    '1993-08-04 00:00:00',
    'Terzino destro',
    4,
    2200000,
    22
  ),
  (
    'Amir',
    'Rrahmani',
    '1994-02-24 00:00:00',
    'Difensore centrale',
    4,
    1800000,
    13
  ),
  (
    'Juan',
    'Jesus',
    '1991-06-10 00:00:00',
    'Difensore centrale',
    4,
    1500000,
    5
  ),
  (
    'Mathías',
    'Olivera',
    '1997-10-31 00:00:00',
    'Terzino sinistro',
    4,
    1600000,
    17
  ),
  (
    'Stanislav',
    'Lobotka',
    '1994-11-25 00:00:00',
    'Centrocampista centrale',
    4,
    2500000,
    68
  ),
  (
    'Frank',
    'Anguissa',
    '1995-11-16 00:00:00',
    'Centrocampista centrale',
    4,
    2300000,
    99
  ),
  (
    'Piotr',
    'Zieliński',
    '1994-05-20 00:00:00',
    'Centrocampista offensivo',
    4,
    3000000,
    20
  );

INSERT INTO
  public.giocatori (
    nome,
    cognome,
    data_nascita,
    ruolo,
    id_squadra,
    stipendio,
    numero_maglia
  )
VALUES
  (
    'Hirving',
    'Lozano',
    '1995-07-30 00:00:00',
    'Ala destra',
    4,
    2700000,
    11
  ),
  (
    'Victor',
    'Osimhen',
    '1998-12-29 00:00:00',
    'Attaccante centrale',
    4,
    4500000,
    9
  ),
  (
    'Khvicha',
    'Kvaratskhelia',
    '2001-02-12 00:00:00',
    'Ala sinistra',
    4,
    1800000,
    77
  ),
  (
    'Samuele',
    'Sensi',
    '1995-08-10 00:00:00',
    'Centrocampista',
    2,
    4500000,
    12
  ),
  (
    'Milan',
    'Skriniar',
    '1995-02-11 00:00:00',
    'Difensore',
    2,
    6500000,
    37
  ),
  (
    'Romelu',
    'Lukaku',
    '1993-05-13 00:00:00',
    'Attaccante',
    2,
    12000000,
    9
  ),
  (
    'Lautaro',
    'Martínez',
    '1997-08-22 00:00:00',
    'Attaccante',
    2,
    8000000,
    10
  ),
  (
    'Nicolo',
    'Barella',
    '1997-02-07 00:00:00',
    'Centrocampista',
    2,
    6000000,
    23
  ),
  (
    'Stefan',
    'De Vrij',
    '1992-02-05 00:00:00',
    'Difensore',
    2,
    7000000,
    6
  ),
  (
    'Achraf',
    'Hakimi',
    '1998-11-04 00:00:00',
    'Difensore',
    2,
    7000000,
    2
  );

INSERT INTO
  public.giocatori (
    nome,
    cognome,
    data_nascita,
    ruolo,
    id_squadra,
    stipendio,
    numero_maglia
  )
VALUES
  (
    'Christian',
    'Eriksen',
    '1992-02-14 00:00:00',
    'Centrocampista',
    2,
    5500000,
    24
  ),
  (
    'Alexis',
    'Sánchez',
    '1988-12-19 00:00:00',
    'Attaccante',
    2,
    9000000,
    7
  ),
  (
    'André',
    'Onana',
    '1996-04-02 00:00:00',
    'Portiere',
    2,
    4000000,
    24
  ),
  (
    'Federico',
    'Dimarco',
    '1997-11-10 00:00:00',
    'Difensore',
    2,
    4500000,
    32
  ),
  (
    'Edin',
    'Džeko',
    '1986-03-17 00:00:00',
    'Attaccante',
    2,
    7000000,
    9
  ),
  (
    'Matteo',
    'Darmian',
    '1989-12-02 00:00:00',
    'Difensore',
    2,
    5000000,
    36
  ),
  (
    'Roberto',
    'Gagliardini',
    '1994-04-07 00:00:00',
    'Centrocampista',
    2,
    3500000,
    5
  ),
  (
    'Alessandro',
    'Bastoni',
    '1999-04-13 00:00:00',
    'Difensore',
    2,
    4800000,
    95
  ),
  (
    'Samir',
    'Handanović',
    '1984-07-14 00:00:00',
    'Portiere',
    2,
    6000000,
    1
  ),
  (
    'Ivan',
    'Perišić',
    '1989-02-02 00:00:00',
    'Attaccante',
    2,
    6000000,
    14
  );

INSERT INTO
  public.giocatori (
    nome,
    cognome,
    data_nascita,
    ruolo,
    id_squadra,
    stipendio,
    numero_maglia
  )
VALUES
  (
    'Mauro',
    'Icardi',
    '1993-02-19 00:00:00',
    'Attaccante',
    2,
    11000000,
    9
  ),
  (
    'Denzel',
    'Dumfries',
    '1996-04-18 00:00:00',
    'Difensore',
    2,
    5000000,
    2
  ),
  (
    'Matías',
    'Vecino',
    '1991-08-24 00:00:00',
    'Centrocampista',
    2,
    4000000,
    8
  ),
  (
    'Roberto',
    'Zanetti',
    '1973-08-10 00:00:00',
    'Centrocampista',
    2,
    6000000,
    4
  ),
  (
    'Marcelo',
    'Brozović',
    '1992-11-16 00:00:00',
    'Centrocampista',
    2,
    8000000,
    77
  ),
  (
    'Lorenzo',
    'Pirola',
    '2002-05-19 00:00:00',
    'Difensore',
    2,
    2000000,
    36
  ),
  (
    'Gianluca',
    'Vidal',
    '1987-05-22 00:00:00',
    'Centrocampista',
    2,
    6000000,
    22
  ),
  (
    'Xian',
    'Xie',
    '1998-11-01 00:00:00',
    'Attaccante',
    2,
    3000000,
    11
  ),
  (
    'Hakan',
    'Çalhanoğlu',
    '1994-02-08 00:00:00',
    'Centrocampista',
    2,
    5500000,
    20
  ),
  (
    'Giuseppe',
    'Mancini',
    '1996-01-12 00:00:00',
    'Centrocampista',
    2,
    4000000,
    23
  );

INSERT INTO
  public.giocatori (
    nome,
    cognome,
    data_nascita,
    ruolo,
    id_squadra,
    stipendio,
    numero_maglia
  )
VALUES
  (
    'Joaquín',
    'Correa',
    '1994-08-13 00:00:00',
    'Attaccante',
    2,
    5500000,
    11
  ),
  (
    'Martin',
    'Satriano',
    '2001-04-17 00:00:00',
    'Attaccante',
    2,
    3500000,
    99
  ),
  (
    'Pierluigi',
    'Gollini',
    '1995-03-18 00:00:00',
    'Portiere',
    4,
    1000000,
    95
  ),
  (
    'Leo',
    'Ostigard',
    '1999-11-28 00:00:00',
    'Difensore centrale',
    4,
    1200000,
    55
  ),
  (
    'Mario',
    'Rui',
    '1991-05-27 00:00:00',
    'Terzino sinistro',
    4,
    1900000,
    6
  ),
  (
    'Eljif',
    'Elmas',
    '1999-09-24 00:00:00',
    'Centrocampista',
    4,
    1400000,
    7
  ),
  (
    'Diego',
    'Demme',
    '1991-11-21 00:00:00',
    'Centrocampista',
    4,
    1500000,
    4
  ),
  (
    'Alessio',
    'Zerbin',
    '1999-03-03 00:00:00',
    'Ala sinistra',
    4,
    800000,
    23
  ),
  (
    'Giacomo',
    'Raspadori',
    '2000-02-18 00:00:00',
    'Seconda punta',
    4,
    2100000,
    81
  ),
  (
    'Giovanni',
    'Simeone',
    '1995-07-05 00:00:00',
    'Attaccante centrale',
    4,
    2000000,
    18
  );

INSERT INTO
  public.giocatori (
    nome,
    cognome,
    data_nascita,
    ruolo,
    id_squadra,
    stipendio,
    numero_maglia
  )
VALUES
  (
    'Nikita',
    'Contini',
    '1996-05-21 00:00:00',
    'Portiere',
    4,
    600000,
    16
  ),
  (
    'Bart',
    'Zielinski',
    '2001-01-01 00:00:00',
    'Difensore centrale',
    4,
    500000,
    3
  ),
  (
    'Antonio',
    'Cioffi',
    '2002-05-18 00:00:00',
    'Ala destra',
    4,
    400000,
    45
  ),
  (
    'Marco',
    'D’Andrea',
    '2003-07-14 00:00:00',
    'Centrocampista offensivo',
    4,
    400000,
    28
  ),
  (
    'Luca',
    'Palmiero',
    '1996-05-01 00:00:00',
    'Centrocampista',
    4,
    450000,
    8
  ),
  (
    'Davide',
    'Costanzo',
    '2003-04-17 00:00:00',
    'Difensore centrale',
    4,
    400000,
    26
  ),
  (
    'Giuseppe',
    'Ambrosino',
    '2003-09-10 00:00:00',
    'Attaccante',
    4,
    400000,
    29
  ),
  (
    'Lorenzo',
    'Mancini',
    '1995-04-12 00:00:00',
    'Difensore',
    5,
    1200000,
    1
  ),
  (
    'Matteo',
    'Rossi',
    '1998-08-22 00:00:00',
    'Centrocampista',
    5,
    850000,
    2
  ),
  (
    'Andrea',
    'Bianchi',
    '1992-03-15 00:00:00',
    'Attaccante',
    5,
    1700000,
    3
  );

INSERT INTO
  public.giocatori (
    nome,
    cognome,
    data_nascita,
    ruolo,
    id_squadra,
    stipendio,
    numero_maglia
  )
VALUES
  (
    'Marco',
    'Verdi',
    '2000-01-10 00:00:00',
    'Difensore',
    5,
    600000,
    4
  ),
  (
    'Filippo',
    'Romano',
    '1997-07-19 00:00:00',
    'Centrocampista',
    5,
    950000,
    5
  ),
  (
    'Simone',
    'Conti',
    '1996-11-25 00:00:00',
    'Attaccante',
    5,
    1100000,
    6
  ),
  (
    'Gianluca',
    'De Santis',
    '1999-06-30 00:00:00',
    'Difensore',
    5,
    700000,
    7
  ),
  (
    'Davide',
    'Martini',
    '2001-05-17 00:00:00',
    'Centrocampista',
    5,
    500000,
    8
  ),
  (
    'Emanuele',
    'Gallo',
    '1994-09-08 00:00:00',
    'Portiere',
    5,
    1300000,
    9
  ),
  (
    'Luca',
    'Ferretti',
    '1993-10-01 00:00:00',
    'Attaccante',
    5,
    1400000,
    10
  ),
  (
    'Nicolo',
    'Palmieri',
    '1995-12-20 00:00:00',
    'Centrocampista',
    5,
    800000,
    11
  ),
  (
    'Riccardo',
    'Parisi',
    '1996-04-03 00:00:00',
    'Difensore',
    5,
    750000,
    12
  ),
  (
    'Francesco',
    'Silvestri',
    '1998-02-14 00:00:00',
    'Attaccante',
    5,
    1000000,
    13
  );

INSERT INTO
  public.giocatori (
    nome,
    cognome,
    data_nascita,
    ruolo,
    id_squadra,
    stipendio,
    numero_maglia
  )
VALUES
  (
    'Antonio',
    'Vitale',
    '1997-09-27 00:00:00',
    'Centrocampista',
    5,
    950000,
    14
  ),
  (
    'Daniele',
    'Ferri',
    '2000-12-05 00:00:00',
    'Difensore',
    5,
    680000,
    15
  ),
  (
    'Michele',
    'Greco',
    '1999-08-09 00:00:00',
    'Centrocampista',
    5,
    850000,
    16
  ),
  (
    'Stefano',
    'Lombardi',
    '1995-05-11 00:00:00',
    'Attaccante',
    5,
    1150000,
    17
  ),
  (
    'Paolo',
    'Barone',
    '1996-03-23 00:00:00',
    'Difensore',
    5,
    720000,
    18
  ),
  (
    'Gabriele',
    'Moretti',
    '1994-07-06 00:00:00',
    'Centrocampista',
    5,
    900000,
    19
  ),
  (
    'Fabio',
    'Leone',
    '1992-11-02 00:00:00',
    'Attaccante',
    5,
    1600000,
    20
  ),
  (
    'Tommaso',
    'Coppola',
    '2001-01-18 00:00:00',
    'Difensore',
    5,
    500000,
    21
  ),
  (
    'Alessandro',
    'Marino',
    '1993-06-29 00:00:00',
    'Centrocampista',
    5,
    780000,
    22
  ),
  (
    'Cristian',
    'Fiore',
    '1997-03-12 00:00:00',
    'Attaccante',
    5,
    1050000,
    23
  );

INSERT INTO
  public.giocatori (
    nome,
    cognome,
    data_nascita,
    ruolo,
    id_squadra,
    stipendio,
    numero_maglia
  )
VALUES
  (
    'Giovanni',
    'Amato',
    '1998-10-04 00:00:00',
    'Portiere',
    5,
    1250000,
    24
  ),
  (
    'Enrico',
    'De Luca',
    '1995-02-28 00:00:00',
    'Difensore',
    5,
    800000,
    25
  ),
  (
    'Alessio',
    'Serra',
    '1996-01-14 00:00:00',
    'Difensore',
    6,
    880000,
    1
  ),
  (
    'Lorenzo',
    'Pellegrini',
    '1998-05-21 00:00:00',
    'Centrocampista',
    6,
    950000,
    2
  ),
  (
    'Giulio',
    'Colombo',
    '1993-08-30 00:00:00',
    'Attaccante',
    6,
    1400000,
    3
  ),
  (
    'Simone',
    'Testa',
    '2000-02-19 00:00:00',
    'Centrocampista',
    6,
    600000,
    4
  ),
  (
    'Davide',
    'Sanna',
    '1997-07-12 00:00:00',
    'Difensore',
    6,
    720000,
    5
  ),
  (
    'Riccardo',
    'Greco',
    '1995-10-06 00:00:00',
    'Attaccante',
    6,
    1250000,
    6
  ),
  (
    'Matteo',
    'Mazza',
    '1999-04-25 00:00:00',
    'Difensore',
    6,
    700000,
    7
  ),
  (
    'Nicola',
    'Vitelli',
    '1996-09-01 00:00:00',
    'Centrocampista',
    6,
    800000,
    8
  );

INSERT INTO
  public.giocatori (
    nome,
    cognome,
    data_nascita,
    ruolo,
    id_squadra,
    stipendio,
    numero_maglia
  )
VALUES
  (
    'Gabriele',
    'Corsi',
    '1994-12-29 00:00:00',
    'Portiere',
    6,
    1350000,
    9
  ),
  (
    'Stefano',
    'Benedetti',
    '1992-03-04 00:00:00',
    'Attaccante',
    6,
    1550000,
    10
  ),
  (
    'Michele',
    'D''Amico',
    '1997-11-11 00:00:00',
    'Centrocampista',
    6,
    920000,
    11
  ),
  (
    'Emanuele',
    'Neri',
    '1995-06-07 00:00:00',
    'Difensore',
    6,
    750000,
    12
  ),
  (
    'Francesco',
    'Bianco',
    '1998-10-15 00:00:00',
    'Attaccante',
    6,
    1080000,
    13
  ),
  (
    'Antonio',
    'Sala',
    '1996-08-20 00:00:00',
    'Centrocampista',
    6,
    870000,
    14
  ),
  (
    'Luca',
    'Monti',
    '2001-03-22 00:00:00',
    'Difensore',
    6,
    500000,
    15
  ),
  (
    'Tommaso',
    'Ferrari',
    '1993-05-28 00:00:00',
    'Attaccante',
    6,
    1320000,
    16
  ),
  (
    'Giacomo',
    'Longo',
    '1999-12-02 00:00:00',
    'Centrocampista',
    6,
    750000,
    17
  ),
  (
    'Daniele',
    'Piras',
    '1994-02-10 00:00:00',
    'Difensore',
    6,
    790000,
    18
  );

INSERT INTO
  public.giocatori (
    nome,
    cognome,
    data_nascita,
    ruolo,
    id_squadra,
    stipendio,
    numero_maglia
  )
VALUES
  (
    'Carlo',
    'Riva',
    '1997-01-30 00:00:00',
    'Centrocampista',
    6,
    820000,
    19
  ),
  (
    'Federico',
    'Amoroso',
    '2000-07-16 00:00:00',
    'Attaccante',
    6,
    980000,
    20
  ),
  (
    'Giovanni',
    'Fontana',
    '1996-06-18 00:00:00',
    'Portiere',
    6,
    1200000,
    21
  ),
  (
    'Cristian',
    'Mariani',
    '1998-11-09 00:00:00',
    'Difensore',
    6,
    690000,
    22
  ),
  (
    'Samuele',
    'Bruno',
    '1995-04-01 00:00:00',
    'Centrocampista',
    6,
    890000,
    23
  ),
  (
    'Filippo',
    'Grassi',
    '1999-09-05 00:00:00',
    'Attaccante',
    6,
    1120000,
    24
  ),
  (
    'Alessandro',
    'Galli',
    '1995-02-20 00:00:00',
    'Difensore',
    7,
    1100000,
    1
  ),
  (
    'Davide',
    'De Luca',
    '1998-08-17 00:00:00',
    'Centrocampista',
    7,
    950000,
    2
  ),
  (
    'Matteo',
    'Ferrara',
    '1997-06-04 00:00:00',
    'Attaccante',
    7,
    1200000,
    3
  ),
  (
    'Francesco',
    'Ricci',
    '2000-01-22 00:00:00',
    'Difensore',
    7,
    700000,
    4
  );

INSERT INTO
  public.giocatori (
    nome,
    cognome,
    data_nascita,
    ruolo,
    id_squadra,
    stipendio,
    numero_maglia
  )
VALUES
  (
    'Marco',
    'Giordano',
    '1996-12-09 00:00:00',
    'Centrocampista',
    7,
    800000,
    5
  ),
  (
    'Simone',
    'Lazzari',
    '1994-05-13 00:00:00',
    'Attaccante',
    7,
    1300000,
    6
  ),
  (
    'Luca',
    'Monti',
    '1999-11-14 00:00:00',
    'Difensore',
    7,
    850000,
    7
  ),
  (
    'Riccardo',
    'Ferri',
    '2000-04-02 00:00:00',
    'Centrocampista',
    7,
    950000,
    8
  ),
  (
    'Emanuele',
    'Caruso',
    '1994-09-15 00:00:00',
    'Portiere',
    7,
    1400000,
    9
  ),
  (
    'Filippo',
    'De Santis',
    '1998-05-19 00:00:00',
    'Attaccante',
    7,
    1100000,
    10
  ),
  (
    'Stefano',
    'Gallo',
    '1995-02-28 00:00:00',
    'Centrocampista',
    7,
    800000,
    11
  ),
  (
    'Antonio',
    'Bianchi',
    '1997-07-23 00:00:00',
    'Difensore',
    7,
    750000,
    12
  ),
  (
    'Giovanni',
    'Verdi',
    '1996-03-30 00:00:00',
    'Attaccante',
    7,
    1050000,
    13
  ),
  (
    'Michele',
    'Marini',
    '1999-10-12 00:00:00',
    'Centrocampista',
    7,
    900000,
    14
  );

INSERT INTO
  public.giocatori (
    nome,
    cognome,
    data_nascita,
    ruolo,
    id_squadra,
    stipendio,
    numero_maglia
  )
VALUES
  (
    'Tommaso',
    'Lombardi',
    '1994-06-05 00:00:00',
    'Difensore',
    7,
    720000,
    15
  ),
  (
    'Cristian',
    'Barone',
    '2001-03-14 00:00:00',
    'Centrocampista',
    7,
    780000,
    16
  ),
  (
    'Gabriele',
    'Palmieri',
    '1997-08-27 00:00:00',
    'Attaccante',
    7,
    1150000,
    17
  ),
  (
    'Enrico',
    'Amato',
    '1996-02-03 00:00:00',
    'Difensore',
    7,
    800000,
    18
  ),
  (
    'Alessandro',
    'Fiore',
    '1994-11-11 00:00:00',
    'Centrocampista',
    7,
    850000,
    19
  ),
  (
    'Paolo',
    'Vitale',
    '1992-07-30 00:00:00',
    'Attaccante',
    7,
    1400000,
    20
  ),
  (
    'Daniele',
    'Lombardi',
    '2000-05-02 00:00:00',
    'Difensore',
    7,
    750000,
    21
  ),
  (
    'Gianluca',
    'Coppola',
    '1995-09-14 00:00:00',
    'Centrocampista',
    7,
    820000,
    22
  ),
  (
    'Simone',
    'Serrano',
    '1997-12-01 00:00:00',
    'Attaccante',
    7,
    1000000,
    23
  ),
  (
    'Giovanni',
    'Costa',
    '1993-04-01 00:00:00',
    'Difensore',
    8,
    1200000,
    1
  );

INSERT INTO
  public.giocatori (
    nome,
    cognome,
    data_nascita,
    ruolo,
    id_squadra,
    stipendio,
    numero_maglia
  )
VALUES
  (
    'Marco',
    'Giordano',
    '1997-11-15 00:00:00',
    'Centrocampista',
    8,
    950000,
    2
  ),
  (
    'Luca',
    'Ferrara',
    '1996-08-22 00:00:00',
    'Attaccante',
    8,
    1300000,
    3
  ),
  (
    'Alessandro',
    'Bianchi',
    '2000-03-10 00:00:00',
    'Difensore',
    8,
    800000,
    4
  ),
  (
    'Andrea',
    'Verdi',
    '1998-06-25 00:00:00',
    'Centrocampista',
    8,
    1100000,
    5
  ),
  (
    'Simone',
    'Ricci',
    '1994-12-30 00:00:00',
    'Attaccante',
    8,
    1500000,
    6
  ),
  (
    'Davide',
    'Moretti',
    '1997-05-05 00:00:00',
    'Difensore',
    8,
    950000,
    7
  ),
  (
    'Francesco',
    'Galli',
    '1995-01-17 00:00:00',
    'Centrocampista',
    8,
    750000,
    8
  ),
  (
    'Emanuele',
    'Sartori',
    '1999-07-20 00:00:00',
    'Portiere',
    8,
    1200000,
    9
  ),
  (
    'Nicolo',
    'Tosi',
    '1993-02-11 00:00:00',
    'Attaccante',
    8,
    1350000,
    10
  ),
  (
    'Stefano',
    'Rossi',
    '1996-10-04 00:00:00',
    'Centrocampista',
    8,
    800000,
    11
  );

INSERT INTO
  public.giocatori (
    nome,
    cognome,
    data_nascita,
    ruolo,
    id_squadra,
    stipendio,
    numero_maglia
  )
VALUES
  (
    'Riccardo',
    'Lombardi',
    '2000-09-13 00:00:00',
    'Difensore',
    8,
    700000,
    12
  ),
  (
    'Giorgio',
    'Mancini',
    '1998-03-26 00:00:00',
    'Attaccante',
    8,
    1400000,
    13
  ),
  (
    'Federico',
    'Marini',
    '1997-12-02 00:00:00',
    'Centrocampista',
    8,
    900000,
    14
  ),
  (
    'Antonio',
    'Ferri',
    '1995-06-09 00:00:00',
    'Difensore',
    8,
    650000,
    15
  ),
  (
    'Daniele',
    'Greco',
    '1999-04-17 00:00:00',
    'Centrocampista',
    8,
    950000,
    16
  ),
  (
    'Paolo',
    'Amato',
    '1994-11-21 00:00:00',
    'Attaccante',
    8,
    1250000,
    17
  ),
  (
    'Matteo',
    'Cavalli',
    '1993-01-29 00:00:00',
    'Difensore',
    8,
    720000,
    18
  ),
  (
    'Michele',
    'Gallo',
    '2000-08-15 00:00:00',
    'Centrocampista',
    8,
    850000,
    19
  ),
  (
    'Fabio',
    'Barone',
    '1992-12-06 00:00:00',
    'Attaccante',
    8,
    1550000,
    20
  ),
  (
    'Tommaso',
    'Palmieri',
    '1997-05-04 00:00:00',
    'Difensore',
    8,
    550000,
    21
  );

INSERT INTO
  public.giocatori (
    nome,
    cognome,
    data_nascita,
    ruolo,
    id_squadra,
    stipendio,
    numero_maglia
  )
VALUES
  (
    'Alessandro',
    'Fiore',
    '1998-09-18 00:00:00',
    'Centrocampista',
    8,
    780000,
    22
  ),
  (
    'Cristian',
    'Leone',
    '1995-02-14 00:00:00',
    'Attaccante',
    8,
    1100000,
    23
  ),
  (
    'Gabriele',
    'Verdi',
    '1999-04-09 00:00:00',
    'Portiere',
    8,
    1300000,
    24
  ),
  (
    'Alessandro',
    'Giordano',
    '1996-03-17 00:00:00',
    'Difensore',
    9,
    950000,
    1
  ),
  (
    'Matteo',
    'Basile',
    '1998-04-05 00:00:00',
    'Centrocampista',
    9,
    820000,
    2
  ),
  (
    'Giovanni',
    'Santoro',
    '1994-11-12 00:00:00',
    'Attaccante',
    9,
    1300000,
    3
  ),
  (
    'Riccardo',
    'D''Amico',
    '1997-02-19 00:00:00',
    'Difensore',
    9,
    780000,
    4
  ),
  (
    'Fabio',
    'Marchetti',
    '1995-06-28 00:00:00',
    'Centrocampista',
    9,
    1100000,
    5
  ),
  (
    'Simone',
    'Cattaneo',
    '2000-01-25 00:00:00',
    'Attaccante',
    9,
    1000000,
    6
  ),
  (
    'Davide',
    'Giorgi',
    '1999-07-13 00:00:00',
    'Difensore',
    9,
    950000,
    7
  );

INSERT INTO
  public.giocatori (
    nome,
    cognome,
    data_nascita,
    ruolo,
    id_squadra,
    stipendio,
    numero_maglia
  )
VALUES
  (
    'Luca',
    'Fiorini',
    '1996-09-06 00:00:00',
    'Centrocampista',
    9,
    850000,
    8
  ),
  (
    'Paolo',
    'Benassi',
    '1994-12-28 00:00:00',
    'Portiere',
    9,
    1500000,
    9
  ),
  (
    'Antonio',
    'Rossetti',
    '1993-05-22 00:00:00',
    'Attaccante',
    9,
    1450000,
    10
  ),
  (
    'Emanuele',
    'Rinaldi',
    '1997-03-07 00:00:00',
    'Centrocampista',
    9,
    900000,
    11
  ),
  (
    'Vincenzo',
    'Bruno',
    '1996-10-04 00:00:00',
    'Difensore',
    9,
    700000,
    12
  ),
  (
    'Gianluca',
    'Moretti',
    '1998-01-30 00:00:00',
    'Attaccante',
    9,
    1200000,
    13
  ),
  (
    'Stefano',
    'Fiore',
    '1995-12-11 00:00:00',
    'Centrocampista',
    9,
    1020000,
    14
  ),
  (
    'Daniele',
    'Verdi',
    '1999-08-23 00:00:00',
    'Difensore',
    9,
    670000,
    15
  ),
  (
    'Michele',
    'Fusco',
    '1997-05-18 00:00:00',
    'Centrocampista',
    9,
    950000,
    16
  ),
  (
    'Luca',
    'Gallo',
    '2000-07-01 00:00:00',
    'Attaccante',
    9,
    1100000,
    17
  );

INSERT INTO
  public.giocatori (
    nome,
    cognome,
    data_nascita,
    ruolo,
    id_squadra,
    stipendio,
    numero_maglia
  )
VALUES
  (
    'Filippo',
    'Conti',
    '1996-04-15 00:00:00',
    'Difensore',
    9,
    720000,
    18
  ),
  (
    'Gabriele',
    'Alessi',
    '1994-09-22 00:00:00',
    'Centrocampista',
    9,
    980000,
    19
  ),
  (
    'Tommaso',
    'Perri',
    '1997-11-09 00:00:00',
    'Attaccante',
    9,
    1250000,
    20
  ),
  (
    'Francesco',
    'Bianco',
    '1995-01-17 00:00:00',
    'Difensore',
    9,
    800000,
    21
  ),
  (
    'Alessandro',
    'Ricci',
    '1993-10-11 00:00:00',
    'Centrocampista',
    9,
    900000,
    22
  ),
  (
    'Cristian',
    'Coppola',
    '1998-06-28 00:00:00',
    'Attaccante',
    9,
    1070000,
    23
  ),
  (
    'Nicola',
    'Leone',
    '1994-12-02 00:00:00',
    'Portiere',
    9,
    1200000,
    24
  ),
  (
    'Enrico',
    'Lombardo',
    '1995-08-21 00:00:00',
    'Difensore',
    9,
    850000,
    25
  ),
  (
    'Alessandro',
    'Bianchi',
    '1996-07-15 00:00:00',
    'Difensore',
    10,
    950000,
    1
  ),
  (
    'Riccardo',
    'Ferrari',
    '1998-02-20 00:00:00',
    'Centrocampista',
    10,
    780000,
    2
  );

INSERT INTO
  public.giocatori (
    nome,
    cognome,
    data_nascita,
    ruolo,
    id_squadra,
    stipendio,
    numero_maglia
  )
VALUES
  (
    'Marco',
    'Gatti',
    '1997-11-02 00:00:00',
    'Attaccante',
    10,
    1150000,
    3
  ),
  (
    'Giovanni',
    'Vitali',
    '1995-03-12 00:00:00',
    'Difensore',
    10,
    700000,
    4
  ),
  (
    'Simone',
    'Pellegrini',
    '2000-06-17 00:00:00',
    'Centrocampista',
    10,
    820000,
    5
  ),
  (
    'Luca',
    'Moretti',
    '1996-08-29 00:00:00',
    'Attaccante',
    10,
    1250000,
    6
  ),
  (
    'Davide',
    'Conti',
    '1994-04-09 00:00:00',
    'Difensore',
    10,
    850000,
    7
  ),
  (
    'Matteo',
    'Marini',
    '1999-12-13 00:00:00',
    'Centrocampista',
    10,
    680000,
    8
  ),
  (
    'Emanuele',
    'Lombardi',
    '1997-05-30 00:00:00',
    'Portiere',
    10,
    1200000,
    9
  ),
  (
    'Francesco',
    'Bassi',
    '1993-09-21 00:00:00',
    'Attaccante',
    10,
    1300000,
    10
  ),
  (
    'Fabio',
    'Di Giacomo',
    '1995-11-05 00:00:00',
    'Centrocampista',
    10,
    750000,
    11
  ),
  (
    'Stefano',
    'Marchetti',
    '1996-03-08 00:00:00',
    'Difensore',
    10,
    800000,
    12
  );

INSERT INTO
  public.giocatori (
    nome,
    cognome,
    data_nascita,
    ruolo,
    id_squadra,
    stipendio,
    numero_maglia
  )
VALUES
  (
    'Cristian',
    'Rossi',
    '1998-01-18 00:00:00',
    'Attaccante',
    10,
    1100000,
    13
  ),
  (
    'Tommaso',
    'Fiore',
    '2000-10-23 00:00:00',
    'Centrocampista',
    10,
    900000,
    14
  ),
  (
    'Gianluca',
    'Amato',
    '1999-05-16 00:00:00',
    'Difensore',
    10,
    720000,
    15
  ),
  (
    'Alessandro',
    'Barone',
    '1997-04-04 00:00:00',
    'Centrocampista',
    10,
    850000,
    16
  ),
  (
    'Nicolo',
    'Tavella',
    '1996-02-10 00:00:00',
    'Attaccante',
    10,
    1150000,
    17
  ),
  (
    'Daniele',
    'Giordano',
    '1994-07-30 00:00:00',
    'Difensore',
    10,
    750000,
    18
  ),
  (
    'Matteo',
    'Pietro',
    '1998-03-14 00:00:00',
    'Centrocampista',
    10,
    950000,
    19
  ),
  (
    'Filippo',
    'De Luca',
    '1995-12-12 00:00:00',
    'Attaccante',
    10,
    1300000,
    20
  ),
  (
    'Riccardo',
    'Gallo',
    '2000-04-21 00:00:00',
    'Difensore',
    10,
    600000,
    21
  ),
  (
    'Andrea',
    'Verdi',
    '1993-09-02 00:00:00',
    'Centrocampista',
    10,
    720000,
    22
  );

INSERT INTO
  public.giocatori (
    nome,
    cognome,
    data_nascita,
    ruolo,
    id_squadra,
    stipendio,
    numero_maglia
  )
VALUES
  (
    'Paolo',
    'Coppola',
    '1996-06-25 00:00:00',
    'Attaccante',
    10,
    1050000,
    23
  ),
  (
    'Giovanni',
    'Mancini',
    '1997-08-10 00:00:00',
    'Portiere',
    10,
    1150000,
    24
  ),
  (
    'Alessandro',
    'Cioffi',
    '1997-03-15 00:00:00',
    'Difensore',
    11,
    900000,
    1
  ),
  (
    'Luca',
    'Marchetti',
    '1996-08-10 00:00:00',
    'Centrocampista',
    11,
    950000,
    2
  ),
  (
    'Giuseppe',
    'Furlan',
    '1995-01-22 00:00:00',
    'Attaccante',
    11,
    1300000,
    3
  ),
  (
    'Davide',
    'Pellegrini',
    '1994-09-17 00:00:00',
    'Difensore',
    11,
    700000,
    4
  ),
  (
    'Francesco',
    'Rosati',
    '1996-05-04 00:00:00',
    'Centrocampista',
    11,
    850000,
    5
  ),
  (
    'Michele',
    'Bianchi',
    '2000-11-01 00:00:00',
    'Attaccante',
    11,
    1100000,
    6
  ),
  (
    'Andrea',
    'Ricci',
    '1997-02-12 00:00:00',
    'Difensore',
    11,
    720000,
    7
  ),
  (
    'Simone',
    'Vitali',
    '1999-04-27 00:00:00',
    'Centrocampista',
    11,
    750000,
    8
  );

INSERT INTO
  public.giocatori (
    nome,
    cognome,
    data_nascita,
    ruolo,
    id_squadra,
    stipendio,
    numero_maglia
  )
VALUES
  (
    'Fabio',
    'Gambino',
    '1998-01-30 00:00:00',
    'Portiere',
    11,
    1200000,
    9
  ),
  (
    'Matteo',
    'Rossi',
    '1994-07-18 00:00:00',
    'Attaccante',
    11,
    1150000,
    10
  ),
  (
    'Antonio',
    'Ferro',
    '1995-09-09 00:00:00',
    'Centrocampista',
    11,
    780000,
    11
  ),
  (
    'Tommaso',
    'Verde',
    '1996-06-23 00:00:00',
    'Difensore',
    11,
    650000,
    12
  ),
  (
    'Lorenzo',
    'Allegri',
    '1997-04-05 00:00:00',
    'Attaccante',
    11,
    1250000,
    13
  ),
  (
    'Emanuele',
    'Marino',
    '1994-11-14 00:00:00',
    'Centrocampista',
    11,
    850000,
    14
  ),
  (
    'Riccardo',
    'De Luca',
    '1999-05-17 00:00:00',
    'Difensore',
    11,
    700000,
    15
  ),
  (
    'Giovanni',
    'Gallo',
    '2001-02-19 00:00:00',
    'Centrocampista',
    11,
    600000,
    16
  ),
  (
    'Stefano',
    'Mazzola',
    '1993-03-13 00:00:00',
    'Attaccante',
    11,
    1300000,
    17
  ),
  (
    'Marco',
    'Leone',
    '1998-10-09 00:00:00',
    'Difensore',
    11,
    680000,
    18
  );

INSERT INTO
  public.giocatori (
    nome,
    cognome,
    data_nascita,
    ruolo,
    id_squadra,
    stipendio,
    numero_maglia
  )
VALUES
  (
    'Cristian',
    'Grassi',
    '1997-07-26 00:00:00',
    'Centrocampista',
    11,
    800000,
    19
  ),
  (
    'Gabriele',
    'Ferri',
    '1995-04-12 00:00:00',
    'Attaccante',
    11,
    1400000,
    20
  ),
  (
    'Daniele',
    'Fiore',
    '1996-03-05 00:00:00',
    'Portiere',
    11,
    1100000,
    21
  ),
  (
    'Alessandro',
    'Ricciardi',
    '1994-06-30 00:00:00',
    'Difensore',
    11,
    720000,
    22
  ),
  (
    'Francesco',
    'Lombardi',
    '1999-12-02 00:00:00',
    'Centrocampista',
    11,
    900000,
    23
  ),
  (
    'Simone',
    'Mancini',
    '1997-08-11 00:00:00',
    'Attaccante',
    11,
    1250000,
    24
  ),
  (
    'Paolo',
    'Santoro',
    '1995-11-28 00:00:00',
    'Difensore',
    11,
    800000,
    25
  ),
  (
    'Alessandro',
    'Grasso',
    '1995-01-15 00:00:00',
    'Difensore',
    12,
    950000,
    1
  ),
  (
    'Francesco',
    'Cappelli',
    '1997-03-11 00:00:00',
    'Centrocampista',
    12,
    800000,
    2
  ),
  (
    'Riccardo',
    'Fabbri',
    '1994-07-22 00:00:00',
    'Attaccante',
    12,
    1150000,
    3
  );

INSERT INTO
  public.giocatori (
    nome,
    cognome,
    data_nascita,
    ruolo,
    id_squadra,
    stipendio,
    numero_maglia
  )
VALUES
  (
    'Tommaso',
    'Vincenzi',
    '1996-04-30 00:00:00',
    'Difensore',
    12,
    780000,
    4
  ),
  (
    'Gianluca',
    'Ferretti',
    '1997-11-02 00:00:00',
    'Centrocampista',
    12,
    900000,
    5
  ),
  (
    'Luca',
    'Molinari',
    '1996-10-12 00:00:00',
    'Attaccante',
    12,
    1100000,
    6
  ),
  (
    'Simone',
    'Rossi',
    '1995-02-28 00:00:00',
    'Difensore',
    12,
    700000,
    7
  ),
  (
    'Matteo',
    'Bianchi',
    '1999-05-06 00:00:00',
    'Centrocampista',
    12,
    850000,
    8
  ),
  (
    'Daniele',
    'Neri',
    '2000-06-29 00:00:00',
    'Portiere',
    12,
    1200000,
    9
  ),
  (
    'Lorenzo',
    'Silvestri',
    '1994-08-09 00:00:00',
    'Attaccante',
    12,
    1300000,
    10
  ),
  (
    'Antonio',
    'Leone',
    '1998-12-14 00:00:00',
    'Centrocampista',
    12,
    850000,
    11
  ),
  (
    'Alessandro',
    'Gallo',
    '1996-07-24 00:00:00',
    'Difensore',
    12,
    710000,
    12
  ),
  (
    'Giuseppe',
    'Verdi',
    '1995-10-06 00:00:00',
    'Attaccante',
    12,
    1200000,
    13
  );

INSERT INTO
  public.giocatori (
    nome,
    cognome,
    data_nascita,
    ruolo,
    id_squadra,
    stipendio,
    numero_maglia
  )
VALUES
  (
    'Fabio',
    'Sarti',
    '1997-04-21 00:00:00',
    'Centrocampista',
    12,
    950000,
    14
  ),
  (
    'Stefano',
    'Moretti',
    '1999-01-19 00:00:00',
    'Difensore',
    12,
    670000,
    15
  ),
  (
    'Marco',
    'Di Carlo',
    '1998-03-15 00:00:00',
    'Centrocampista',
    12,
    790000,
    16
  ),
  (
    'Simone',
    'Greco',
    '1994-10-09 00:00:00',
    'Attaccante',
    12,
    1250000,
    17
  ),
  (
    'Riccardo',
    'Palmieri',
    '1997-05-12 00:00:00',
    'Difensore',
    12,
    720000,
    18
  ),
  (
    'Francesco',
    'De Luca',
    '1999-08-04 00:00:00',
    'Centrocampista',
    12,
    850000,
    19
  ),
  (
    'Giovanni',
    'Cappelli',
    '1995-03-22 00:00:00',
    'Attaccante',
    12,
    1400000,
    20
  ),
  (
    'Paolo',
    'Barbieri',
    '1996-05-28 00:00:00',
    'Portiere',
    12,
    1150000,
    21
  ),
  (
    'Matteo',
    'Berni',
    '1997-10-17 00:00:00',
    'Difensore',
    12,
    700000,
    22
  ),
  (
    'Luca',
    'Mariani',
    '1999-02-24 00:00:00',
    'Centrocampista',
    12,
    800000,
    23
  );

INSERT INTO
  public.giocatori (
    nome,
    cognome,
    data_nascita,
    ruolo,
    id_squadra,
    stipendio,
    numero_maglia
  )
VALUES
  (
    'Emanuele',
    'Fiore',
    '1994-11-30 00:00:00',
    'Attaccante',
    12,
    1100000,
    24
  ),
  (
    'Marco',
    'Gatti',
    '1995-06-15 00:00:00',
    'Difensore',
    13,
    750000,
    1
  ),
  (
    'Luca',
    'Bianchi',
    '1998-03-09 00:00:00',
    'Centrocampista',
    13,
    650000,
    2
  ),
  (
    'Andrea',
    'Silvestri',
    '1994-10-11 00:00:00',
    'Attaccante',
    13,
    1100000,
    3
  ),
  (
    'Alessandro',
    'Rossi',
    '1997-01-25 00:00:00',
    'Difensore',
    13,
    700000,
    4
  ),
  (
    'Francesco',
    'De Santis',
    '1996-11-17 00:00:00',
    'Centrocampista',
    13,
    800000,
    5
  ),
  (
    'Simone',
    'Verdi',
    '1999-07-20 00:00:00',
    'Attaccante',
    13,
    950000,
    6
  ),
  (
    'Davide',
    'Martini',
    '2000-09-10 00:00:00',
    'Difensore',
    13,
    600000,
    7
  ),
  (
    'Gianluca',
    'Coppola',
    '1995-12-04 00:00:00',
    'Centrocampista',
    13,
    750000,
    8
  ),
  (
    'Giovanni',
    'Barone',
    '1993-04-15 00:00:00',
    'Portiere',
    13,
    1000000,
    9
  );

INSERT INTO
  public.giocatori (
    nome,
    cognome,
    data_nascita,
    ruolo,
    id_squadra,
    stipendio,
    numero_maglia
  )
VALUES
  (
    'Antonio',
    'Greco',
    '1994-02-02 00:00:00',
    'Attaccante',
    13,
    1200000,
    10
  ),
  (
    'Riccardo',
    'Lombardi',
    '1996-06-11 00:00:00',
    'Centrocampista',
    13,
    850000,
    11
  ),
  (
    'Nicolo',
    'Amato',
    '1999-03-25 00:00:00',
    'Difensore',
    13,
    680000,
    12
  ),
  (
    'Stefano',
    'Fiore',
    '1997-12-10 00:00:00',
    'Attaccante',
    13,
    900000,
    13
  ),
  (
    'Cristian',
    'Ferri',
    '1998-07-02 00:00:00',
    'Centrocampista',
    13,
    700000,
    14
  ),
  (
    'Fabio',
    'Marino',
    '1995-05-05 00:00:00',
    'Difensore',
    13,
    720000,
    15
  ),
  (
    'Matteo',
    'Lupo',
    '1993-08-13 00:00:00',
    'Centrocampista',
    13,
    850000,
    16
  ),
  (
    'Enrico',
    'Palmieri',
    '1996-04-28 00:00:00',
    'Attaccante',
    13,
    1050000,
    17
  ),
  (
    'Tommaso',
    'Romano',
    '1997-02-14 00:00:00',
    'Difensore',
    13,
    680000,
    18
  ),
  (
    'Davide',
    'Fiorelli',
    '1994-11-03 00:00:00',
    'Centrocampista',
    13,
    750000,
    19
  );

INSERT INTO
  public.giocatori (
    nome,
    cognome,
    data_nascita,
    ruolo,
    id_squadra,
    stipendio,
    numero_maglia
  )
VALUES
  (
    'Paolo',
    'Gallo',
    '1998-01-22 00:00:00',
    'Attaccante',
    13,
    950000,
    20
  ),
  (
    'Lorenzo',
    'Giordano',
    '1999-05-30 00:00:00',
    'Difensore',
    13,
    600000,
    21
  ),
  (
    'Simone',
    'Romano',
    '1995-07-08 00:00:00',
    'Centrocampista',
    13,
    800000,
    22
  ),
  (
    'Michele',
    'Santoro',
    '1993-12-18 00:00:00',
    'Attaccante',
    13,
    1100000,
    23
  ),
  (
    'Giuseppe',
    'De Luca',
    '1996-09-03 00:00:00',
    'Portiere',
    13,
    950000,
    24
  ),
  (
    'Alessandro',
    'Luzzi',
    '2000-04-20 00:00:00',
    'Difensore',
    13,
    650000,
    25
  ),
  (
    'Matteo',
    'Bianchi',
    '1996-11-17 00:00:00',
    'Difensore',
    14,
    700000,
    1
  ),
  (
    'Andrea',
    'Verdi',
    '1998-07-03 00:00:00',
    'Centrocampista',
    14,
    800000,
    2
  ),
  (
    'Davide',
    'Lombardi',
    '1997-04-25 00:00:00',
    'Attaccante',
    14,
    1200000,
    3
  ),
  (
    'Simone',
    'Martini',
    '1995-06-18 00:00:00',
    'Difensore',
    14,
    650000,
    4
  );

INSERT INTO
  public.giocatori (
    nome,
    cognome,
    data_nascita,
    ruolo,
    id_squadra,
    stipendio,
    numero_maglia
  )
VALUES
  (
    'Gianluca',
    'Ferri',
    '1993-12-21 00:00:00',
    'Centrocampista',
    14,
    900000,
    5
  ),
  (
    'Francesco',
    'Romano',
    '1994-10-13 00:00:00',
    'Attaccante',
    14,
    1000000,
    6
  ),
  (
    'Luca',
    'Coppola',
    '1996-09-04 00:00:00',
    'Difensore',
    14,
    600000,
    7
  ),
  (
    'Cristian',
    'Leone',
    '1999-02-28 00:00:00',
    'Centrocampista',
    14,
    750000,
    8
  ),
  (
    'Riccardo',
    'Giordano',
    '1995-03-19 00:00:00',
    'Portiere',
    14,
    950000,
    9
  ),
  (
    'Paolo',
    'Bianchi',
    '1997-01-21 00:00:00',
    'Attaccante',
    14,
    1150000,
    10
  ),
  (
    'Antonio',
    'Gallo',
    '1998-12-05 00:00:00',
    'Centrocampista',
    14,
    800000,
    11
  ),
  (
    'Nicolo',
    'Lupo',
    '1994-06-23 00:00:00',
    'Difensore',
    14,
    700000,
    12
  ),
  (
    'Stefano',
    'Greco',
    '1999-04-17 00:00:00',
    'Attaccante',
    14,
    950000,
    13
  ),
  (
    'Giovanni',
    'Amato',
    '1996-10-10 00:00:00',
    'Centrocampista',
    14,
    820000,
    14
  );

INSERT INTO
  public.giocatori (
    nome,
    cognome,
    data_nascita,
    ruolo,
    id_squadra,
    stipendio,
    numero_maglia
  )
VALUES
  (
    'Simone',
    'Santoro',
    '1997-08-02 00:00:00',
    'Difensore',
    14,
    650000,
    15
  ),
  (
    'Tommaso',
    'Verdi',
    '1993-07-30 00:00:00',
    'Centrocampista',
    14,
    750000,
    16
  ),
  (
    'Michele',
    'De Santis',
    '1995-01-24 00:00:00',
    'Attaccante',
    14,
    1100000,
    17
  ),
  (
    'Daniele',
    'Palmieri',
    '1996-03-29 00:00:00',
    'Difensore',
    14,
    670000,
    18
  ),
  (
    'Matteo',
    'Baldini',
    '1998-09-14 00:00:00',
    'Centrocampista',
    14,
    780000,
    19
  ),
  (
    'Fabio',
    'Lombardi',
    '1997-05-01 00:00:00',
    'Attaccante',
    14,
    1000000,
    20
  ),
  (
    'Alessandro',
    'Ferri',
    '1994-11-18 00:00:00',
    'Difensore',
    14,
    700000,
    21
  ),
  (
    'Cristian',
    'Leone',
    '1995-10-08 00:00:00',
    'Centrocampista',
    14,
    850000,
    22
  ),
  (
    'Emanuele',
    'Moretti',
    '1999-06-12 00:00:00',
    'Attaccante',
    14,
    950000,
    23
  ),
  (
    'Giuseppe',
    'Romano',
    '1998-02-15 00:00:00',
    'Portiere',
    14,
    1200000,
    24
  );

INSERT INTO
  public.giocatori (
    nome,
    cognome,
    data_nascita,
    ruolo,
    id_squadra,
    stipendio,
    numero_maglia
  )
VALUES
  (
    'Alessandro',
    'Sanna',
    '1995-04-12 00:00:00',
    'Difensore',
    14,
    950000,
    1
  ),
  (
    'Matteo',
    'Mura',
    '1998-08-22 00:00:00',
    'Centrocampista',
    14,
    750000,
    2
  ),
  (
    'Gabriele',
    'Piras',
    '1994-03-15 00:00:00',
    'Attaccante',
    14,
    1400000,
    3
  ),
  (
    'Simone',
    'Lai',
    '2000-01-10 00:00:00',
    'Difensore',
    14,
    600000,
    4
  ),
  (
    'Francesco',
    'Pinna',
    '1997-07-19 00:00:00',
    'Centrocampista',
    14,
    800000,
    5
  ),
  (
    'Nicola',
    'Baiocco',
    '1996-11-25 00:00:00',
    'Attaccante',
    14,
    1000000,
    6
  ),
  (
    'Andrea',
    'Corda',
    '1999-06-30 00:00:00',
    'Difensore',
    14,
    650000,
    7
  ),
  (
    'Davide',
    'Vacca',
    '2001-05-17 00:00:00',
    'Centrocampista',
    14,
    550000,
    8
  ),
  (
    'Luca',
    'Carta',
    '1994-09-08 00:00:00',
    'Portiere',
    14,
    1200000,
    9
  ),
  (
    'Lorenzo',
    'Ardau',
    '1993-10-01 00:00:00',
    'Attaccante',
    14,
    1350000,
    10
  );

INSERT INTO
  public.giocatori (
    nome,
    cognome,
    data_nascita,
    ruolo,
    id_squadra,
    stipendio,
    numero_maglia
  )
VALUES
  (
    'Matteo',
    'Cocco',
    '1995-12-20 00:00:00',
    'Centrocampista',
    14,
    700000,
    11
  ),
  (
    'Riccardo',
    'Melis',
    '1996-04-03 00:00:00',
    'Difensore',
    14,
    720000,
    12
  ),
  (
    'Stefano',
    'Fadda',
    '1998-02-14 00:00:00',
    'Attaccante',
    14,
    1050000,
    13
  ),
  (
    'Giovanni',
    'Mendola',
    '1997-09-27 00:00:00',
    'Centrocampista',
    14,
    900000,
    14
  ),
  (
    'Daniele',
    'Spano',
    '2000-12-05 00:00:00',
    'Difensore',
    14,
    680000,
    15
  ),
  (
    'Gianluca',
    'Sulas',
    '1999-08-09 00:00:00',
    'Centrocampista',
    14,
    800000,
    16
  ),
  (
    'Alessandro',
    'Liori',
    '1995-05-11 00:00:00',
    'Attaccante',
    14,
    1150000,
    17
  ),
  (
    'Paolo',
    'Porcu',
    '1996-03-23 00:00:00',
    'Difensore',
    14,
    740000,
    18
  ),
  (
    'Enrico',
    'Saba',
    '1994-07-06 00:00:00',
    'Centrocampista',
    14,
    850000,
    19
  ),
  (
    'Fabio',
    'Cuccu',
    '1992-11-02 00:00:00',
    'Attaccante',
    14,
    1600000,
    20
  );

INSERT INTO
  public.giocatori (
    nome,
    cognome,
    data_nascita,
    ruolo,
    id_squadra,
    stipendio,
    numero_maglia
  )
VALUES
  (
    'Alessandro',
    'Angioni',
    '2001-01-18 00:00:00',
    'Difensore',
    14,
    550000,
    21
  ),
  (
    'Giovanni',
    'Laio',
    '1993-06-29 00:00:00',
    'Centrocampista',
    14,
    780000,
    22
  ),
  (
    'Cristian',
    'Lai',
    '1997-03-12 00:00:00',
    'Attaccante',
    14,
    1020000,
    23
  ),
  (
    'Tommaso',
    'Serra',
    '1998-10-04 00:00:00',
    'Portiere',
    14,
    1200000,
    24
  ),
  (
    'Francesco',
    'Sulas',
    '1995-02-28 00:00:00',
    'Difensore',
    14,
    750000,
    25
  ),
  (
    'Alessandro',
    'Bianchi',
    '1995-04-12 00:00:00',
    'Difensore',
    16,
    920000,
    1
  ),
  (
    'Luca',
    'Rossi',
    '1998-08-22 00:00:00',
    'Centrocampista',
    16,
    780000,
    2
  ),
  (
    'Gabriele',
    'Verdi',
    '1994-03-15 00:00:00',
    'Attaccante',
    16,
    1300000,
    3
  ),
  (
    'Riccardo',
    'Franchi',
    '2000-01-10 00:00:00',
    'Difensore',
    16,
    600000,
    4
  ),
  (
    'Simone',
    'Mazzoli',
    '1997-07-19 00:00:00',
    'Centrocampista',
    16,
    850000,
    5
  );

INSERT INTO
  public.giocatori (
    nome,
    cognome,
    data_nascita,
    ruolo,
    id_squadra,
    stipendio,
    numero_maglia
  )
VALUES
  (
    'Davide',
    'Conti',
    '1996-11-25 00:00:00',
    'Attaccante',
    16,
    1000000,
    6
  ),
  (
    'Francesco',
    'Giordano',
    '1999-06-30 00:00:00',
    'Difensore',
    16,
    650000,
    7
  ),
  (
    'Matteo',
    'Tanti',
    '2001-05-17 00:00:00',
    'Centrocampista',
    16,
    530000,
    8
  ),
  (
    'Lorenzo',
    'Cappelli',
    '1994-09-08 00:00:00',
    'Portiere',
    16,
    1200000,
    9
  ),
  (
    'Andrea',
    'Alessi',
    '1993-10-01 00:00:00',
    'Attaccante',
    16,
    1300000,
    10
  ),
  (
    'Nicola',
    'Bianchi',
    '1995-12-20 00:00:00',
    'Centrocampista',
    16,
    700000,
    11
  ),
  (
    'Giovanni',
    'Rossi',
    '1996-04-03 00:00:00',
    'Difensore',
    16,
    740000,
    12
  ),
  (
    'Stefano',
    'Giannini',
    '1998-02-14 00:00:00',
    'Attaccante',
    16,
    1050000,
    13
  ),
  (
    'Marco',
    'Tantini',
    '1997-09-27 00:00:00',
    'Centrocampista',
    16,
    900000,
    14
  ),
  (
    'Daniele',
    'Baldini',
    '2000-12-05 00:00:00',
    'Difensore',
    16,
    650000,
    15
  );

INSERT INTO
  public.giocatori (
    nome,
    cognome,
    data_nascita,
    ruolo,
    id_squadra,
    stipendio,
    numero_maglia
  )
VALUES
  (
    'Gianluca',
    'De Luca',
    '1999-08-09 00:00:00',
    'Centrocampista',
    16,
    800000,
    16
  ),
  (
    'Stefano',
    'Santi',
    '1995-05-11 00:00:00',
    'Attaccante',
    16,
    1150000,
    17
  ),
  (
    'Fabio',
    'Mauri',
    '1996-03-23 00:00:00',
    'Difensore',
    16,
    750000,
    18
  ),
  (
    'Alessandro',
    'Vieri',
    '1994-07-06 00:00:00',
    'Centrocampista',
    16,
    850000,
    19
  ),
  (
    'Matteo',
    'Vito',
    '1992-11-02 00:00:00',
    'Attaccante',
    16,
    1500000,
    20
  ),
  (
    'Riccardo',
    'Sarri',
    '2001-01-18 00:00:00',
    'Difensore',
    16,
    560000,
    21
  ),
  (
    'Luca',
    'Della Valle',
    '1993-06-29 00:00:00',
    'Centrocampista',
    16,
    770000,
    22
  ),
  (
    'Cristian',
    'Sereni',
    '1997-03-12 00:00:00',
    'Attaccante',
    16,
    1030000,
    23
  ),
  (
    'Giovanni',
    'Mencarelli',
    '1998-10-04 00:00:00',
    'Portiere',
    16,
    1250000,
    24
  ),
  (
    'Luca',
    'Giordano',
    '1996-05-14 00:00:00',
    'Difensore',
    17,
    1100000,
    1
  );

INSERT INTO
  public.giocatori (
    nome,
    cognome,
    data_nascita,
    ruolo,
    id_squadra,
    stipendio,
    numero_maglia
  )
VALUES
  (
    'Francesco',
    'Conti',
    '1998-02-28 00:00:00',
    'Centrocampista',
    17,
    950000,
    2
  ),
  (
    'Antonio',
    'Martini',
    '1995-09-20 00:00:00',
    'Attaccante',
    17,
    1400000,
    3
  ),
  (
    'Daniele',
    'Coppola',
    '2000-07-10 00:00:00',
    'Difensore',
    17,
    700000,
    4
  ),
  (
    'Marco',
    'Ferrara',
    '1997-12-01 00:00:00',
    'Centrocampista',
    17,
    850000,
    5
  ),
  (
    'Stefano',
    'Pinto',
    '1999-03-13 00:00:00',
    'Attaccante',
    17,
    1200000,
    6
  ),
  (
    'Simone',
    'Greco',
    '2000-01-22 00:00:00',
    'Difensore',
    17,
    800000,
    7
  ),
  (
    'Riccardo',
    'Baldini',
    '1998-06-17 00:00:00',
    'Centrocampista',
    17,
    780000,
    8
  ),
  (
    'Alessandro',
    'Rossi',
    '1994-11-14 00:00:00',
    'Portiere',
    17,
    1300000,
    9
  ),
  (
    'Lorenzo',
    'De Luca',
    '1993-03-03 00:00:00',
    'Attaccante',
    17,
    1450000,
    10
  ),
  (
    'Filippo',
    'Romano',
    '1996-12-07 00:00:00',
    'Centrocampista',
    17,
    900000,
    11
  );

INSERT INTO
  public.giocatori (
    nome,
    cognome,
    data_nascita,
    ruolo,
    id_squadra,
    stipendio,
    numero_maglia
  )
VALUES
  (
    'Giovanni',
    'Verdi',
    '1997-04-09 00:00:00',
    'Difensore',
    17,
    730000,
    12
  ),
  (
    'Michele',
    'Gallo',
    '1999-02-12 00:00:00',
    'Attaccante',
    17,
    1050000,
    13
  ),
  (
    'Tommaso',
    'Leone',
    '1995-08-16 00:00:00',
    'Centrocampista',
    17,
    1000000,
    14
  ),
  (
    'Davide',
    'Ferri',
    '2000-01-30 00:00:00',
    'Difensore',
    17,
    720000,
    15
  ),
  (
    'Alessandro',
    'Marino',
    '1998-10-25 00:00:00',
    'Centrocampista',
    17,
    780000,
    16
  ),
  (
    'Paolo',
    'Barone',
    '1994-12-13 00:00:00',
    'Attaccante',
    17,
    1150000,
    17
  ),
  (
    'Cristian',
    'Silvestri',
    '1997-06-05 00:00:00',
    'Difensore',
    17,
    690000,
    18
  ),
  (
    'Luca',
    'Ferretti',
    '1996-03-28 00:00:00',
    'Centrocampista',
    17,
    840000,
    19
  ),
  (
    'Simone',
    'De Santis',
    '1993-07-04 00:00:00',
    'Attaccante',
    17,
    1300000,
    20
  ),
  (
    'Enrico',
    'Marini',
    '1998-05-11 00:00:00',
    'Difensore',
    17,
    650000,
    21
  );

INSERT INTO
  public.giocatori (
    nome,
    cognome,
    data_nascita,
    ruolo,
    id_squadra,
    stipendio,
    numero_maglia
  )
VALUES
  (
    'Matteo',
    'Bianchi',
    '2001-09-06 00:00:00',
    'Centrocampista',
    17,
    570000,
    22
  ),
  (
    'Gabriele',
    'Vitale',
    '1995-04-01 00:00:00',
    'Attaccante',
    17,
    1050000,
    23
  ),
  (
    'Marco',
    'Palmieri',
    '1994-11-22 00:00:00',
    'Portiere',
    17,
    1200000,
    24
  ),
  (
    'Alessandro',
    'Baldini',
    '1996-01-17 00:00:00',
    'Difensore',
    17,
    700000,
    25
  ),
  (
    'Lorenzo',
    'Greco',
    '1995-11-08 00:00:00',
    'Difensore',
    18,
    1000000,
    1
  ),
  (
    'Giovanni',
    'Ferri',
    '1996-02-24 00:00:00',
    'Centrocampista',
    18,
    850000,
    2
  ),
  (
    'Filippo',
    'Coppola',
    '1999-06-15 00:00:00',
    'Attaccante',
    18,
    1300000,
    3
  ),
  (
    'Stefano',
    'Rossi',
    '1997-07-01 00:00:00',
    'Difensore',
    18,
    800000,
    4
  ),
  (
    'Marco',
    'Giordano',
    '2000-03-29 00:00:00',
    'Centrocampista',
    18,
    900000,
    5
  ),
  (
    'Luca',
    'De Santis',
    '1998-05-17 00:00:00',
    'Attaccante',
    18,
    1150000,
    6
  );

INSERT INTO
  public.giocatori (
    nome,
    cognome,
    data_nascita,
    ruolo,
    id_squadra,
    stipendio,
    numero_maglia
  )
VALUES
  (
    'Matteo',
    'Pinto',
    '1996-04-18 00:00:00',
    'Difensore',
    18,
    700000,
    7
  ),
  (
    'Antonio',
    'Bianchi',
    '2001-12-10 00:00:00',
    'Centrocampista',
    18,
    720000,
    8
  ),
  (
    'Gianluca',
    'Ferretti',
    '1994-09-01 00:00:00',
    'Portiere',
    18,
    1250000,
    9
  ),
  (
    'Daniele',
    'Verdi',
    '1993-08-20 00:00:00',
    'Attaccante',
    18,
    1400000,
    10
  ),
  (
    'Simone',
    'Marini',
    '1996-07-10 00:00:00',
    'Centrocampista',
    18,
    800000,
    11
  ),
  (
    'Riccardo',
    'Coppola',
    '1997-05-23 00:00:00',
    'Difensore',
    18,
    750000,
    12
  ),
  (
    'Emanuele',
    'Leone',
    '2000-11-30 00:00:00',
    'Attaccante',
    18,
    950000,
    13
  ),
  (
    'Francesco',
    'Lombardi',
    '1995-04-04 00:00:00',
    'Centrocampista',
    18,
    830000,
    14
  ),
  (
    'Alessandro',
    'Silvestri',
    '1998-10-12 00:00:00',
    'Difensore',
    18,
    670000,
    15
  ),
  (
    'Gabriele',
    'Baldini',
    '1999-03-02 00:00:00',
    'Centrocampista',
    18,
    880000,
    16
  );

INSERT INTO
  public.giocatori (
    nome,
    cognome,
    data_nascita,
    ruolo,
    id_squadra,
    stipendio,
    numero_maglia
  )
VALUES
  (
    'Paolo',
    'Gallo',
    '1994-02-17 00:00:00',
    'Attaccante',
    18,
    1100000,
    17
  ),
  (
    'Riccardo',
    'Greco',
    '1997-09-11 00:00:00',
    'Difensore',
    18,
    740000,
    18
  ),
  (
    'Luca',
    'Marino',
    '2000-06-03 00:00:00',
    'Centrocampista',
    18,
    950000,
    19
  ),
  (
    'Simone',
    'Ferri',
    '1995-01-25 00:00:00',
    'Attaccante',
    18,
    1250000,
    20
  ),
  (
    'Michele',
    'Conti',
    '1996-12-08 00:00:00',
    'Difensore',
    18,
    700000,
    21
  ),
  (
    'Andrea',
    'Pinto',
    '1999-05-17 00:00:00',
    'Centrocampista',
    18,
    800000,
    22
  ),
  (
    'Antonio',
    'Vitale',
    '1998-08-30 00:00:00',
    'Attaccante',
    18,
    1000000,
    23
  ),
  (
    'Tommaso',
    'Barone',
    '1997-11-12 00:00:00',
    'Portiere',
    18,
    1200000,
    24
  ),
  (
    'Luca',
    'Rossi',
    '1994-02-14 00:00:00',
    'Difensore',
    20,
    700000,
    1
  ),
  (
    'Antonio',
    'Giordano',
    '1995-03-21 00:00:00',
    'Centrocampista',
    20,
    850000,
    2
  );

INSERT INTO
  public.giocatori (
    nome,
    cognome,
    data_nascita,
    ruolo,
    id_squadra,
    stipendio,
    numero_maglia
  )
VALUES
  (
    'Marco',
    'Bellini',
    '1998-07-06 00:00:00',
    'Attaccante',
    20,
    1000000,
    3
  ),
  (
    'Stefano',
    'Vitali',
    '1996-11-03 00:00:00',
    'Difensore',
    20,
    800000,
    4
  ),
  (
    'Riccardo',
    'Di Stefano',
    '1997-08-22 00:00:00',
    'Centrocampista',
    20,
    950000,
    5
  ),
  (
    'Filippo',
    'Greco',
    '1999-09-12 00:00:00',
    'Attaccante',
    20,
    1100000,
    6
  ),
  (
    'Matteo',
    'Conti',
    '1996-12-10 00:00:00',
    'Difensore',
    20,
    750000,
    7
  ),
  (
    'Giuseppe',
    'Mancini',
    '1998-01-01 00:00:00',
    'Centrocampista',
    20,
    800000,
    8
  ),
  (
    'Alessandro',
    'Ferrara',
    '2000-04-19 00:00:00',
    'Portiere',
    20,
    1200000,
    9
  ),
  (
    'Francesco',
    'Romano',
    '1995-06-09 00:00:00',
    'Attaccante',
    20,
    1000000,
    10
  ),
  (
    'Emanuele',
    'Bianchi',
    '1997-10-26 00:00:00',
    'Centrocampista',
    20,
    800000,
    11
  ),
  (
    'Davide',
    'Santucci',
    '1994-03-12 00:00:00',
    'Difensore',
    20,
    700000,
    12
  );

INSERT INTO
  public.giocatori (
    nome,
    cognome,
    data_nascita,
    ruolo,
    id_squadra,
    stipendio,
    numero_maglia
  )
VALUES
  (
    'Lorenzo',
    'Palladino',
    '1999-05-04 00:00:00',
    'Attaccante',
    20,
    950000,
    13
  ),
  (
    'Simone',
    'Fiore',
    '1996-06-23 00:00:00',
    'Centrocampista',
    20,
    800000,
    14
  ),
  (
    'Fabio',
    'Moretti',
    '1995-02-16 00:00:00',
    'Difensore',
    20,
    700000,
    15
  ),
  (
    'Riccardo',
    'Coppola',
    '1998-09-02 00:00:00',
    'Centrocampista',
    20,
    950000,
    16
  ),
  (
    'Gabriele',
    'Lombardi',
    '1996-12-11 00:00:00',
    'Attaccante',
    20,
    1050000,
    17
  ),
  (
    'Matteo',
    'Barone',
    '1999-11-07 00:00:00',
    'Difensore',
    20,
    750000,
    18
  ),
  (
    'Alessandro',
    'De Luca',
    '1994-10-03 00:00:00',
    'Centrocampista',
    20,
    820000,
    19
  ),
  (
    'Francesco',
    'Lombardo',
    '1997-02-18 00:00:00',
    'Portiere',
    20,
    1300000,
    20
  ),
  (
    'Gianluca',
    'Ricci',
    '1995-05-20 00:00:00',
    'Difensore',
    20,
    770000,
    21
  ),
  (
    'Cristiano',
    'Pellegrini',
    '1998-03-14 00:00:00',
    'Centrocampista',
    20,
    800000,
    22
  );

INSERT INTO
  public.giocatori (
    nome,
    cognome,
    data_nascita,
    ruolo,
    id_squadra,
    stipendio,
    numero_maglia
  )
VALUES
  (
    'Enrico',
    'Marini',
    '1996-08-23 00:00:00',
    'Attaccante',
    20,
    950000,
    23
  ),
  (
    'Giovanni',
    'Cattaneo',
    '1999-11-16 00:00:00',
    'Difensore',
    20,
    750000,
    24
  );

INSERT INTO
  public.trasferimenti (
    stipendio_giocatore,
    budget_squadra_fornisce,
    budget_squadra_cliente,
    prezzo_trasferimento
  )
VALUES
  (5000000, 250000000, 320000000, 70000000),
  (4500000, 230000000, 300000000, 68000000),
  (4000000, 220000000, 290000000, 65000000),
  (3500000, 210000000, 280000000, 60000000),
  (3000000, 200000000, 270000000, 57000000),
  (2500000, 190000000, 260000000, 54000000),
  (2000000, 180000000, 250000000, 50000000),
  (1500000, 180000000, 240000000, 48000000),
  (1200000, 170000000, 230000000, 45000000),
  (1000000, 160000000, 220000000, 42000000);

INSERT INTO
  public.trasferimenti (
    stipendio_giocatore,
    budget_squadra_fornisce,
    budget_squadra_cliente,
    prezzo_trasferimento
  )
VALUES
  (950000, 150000000, 210000000, 40000000),
  (900000, 140000000, 200000000, 38000000),
  (850000, 130000000, 190000000, 36000000),
  (800000, 120000000, 180000000, 34000000),
  (750000, 110000000, 170000000, 32000000),
  (700000, 100000000, 160000000, 30000000),
  (650000, 90000000, 150000000, 28000000),
  (600000, 85000000, 140000000, 26000000),
  (550000, 80000000, 130000000, 24000000),
  (500000, 75000000, 120000000, 22000000);

INSERT INTO
  public.trasferimenti (
    stipendio_giocatore,
    budget_squadra_fornisce,
    budget_squadra_cliente,
    prezzo_trasferimento
  )
VALUES
  (450000, 70000000, 110000000, 20000000),
  (400000, 65000000, 100000000, 18000000),
  (350000, 60000000, 90000000, 16000000),
  (300000, 55000000, 80000000, 14000000),
  (250000, 50000000, 70000000, 12000000),
  (200000, 45000000, 60000000, 10000000),
  (150000, 40000000, 50000000, 9000000),
  (120000, 35000000, 40000000, 8000000),
  (100000, 30000000, 30000000, 7000000),
  (95000, 28000000, 20000000, 6000000);

INSERT INTO
  public.trasferimenti (
    stipendio_giocatore,
    budget_squadra_fornisce,
    budget_squadra_cliente,
    prezzo_trasferimento
  )
VALUES
  (90000, 27000000, 15000000, 5000000),
  (85000, 26000000, 10000000, 4000000),
  (80000, 25000000, 5000000, 3000000),
  (75000, 24000000, 3000000, 2000000),
  (70000, 23000000, 2000000, 1500000),
  (65000, 22000000, 1000000, 1000000),
  (60000, 21000000, 500000, 750000),
  (55000, 20000000, 200000, 500000),
  (50000, 19000000, 100000, 300000),
  (45000, 18000000, 50000, 200000);

INSERT INTO
  public.trasferimenti (
    stipendio_giocatore,
    budget_squadra_fornisce,
    budget_squadra_cliente,
    prezzo_trasferimento
  )
VALUES
  (40000, 17000000, 20000, 150000),
  (35000, 16000000, 10000, 100000),
  (30000, 15000000, 5000000, 50000),
  (25000, 14000000, 200000, 25000),
  (20000, 13000000, 1000000, 10000),
  (15000, 12000000, 10000000, 5000),
  (12000, 11000000, 2000000, 2000),
  (10000, 10000000, 100000, 10000),
  (9500, 9500000, 5000000, 500000),
  (9000, 9000000, 500000, 2500);

INSERT INTO
  public.trasferimenti (
    stipendio_giocatore,
    budget_squadra_fornisce,
    budget_squadra_cliente,
    prezzo_trasferimento
  )
VALUES
  (8500, 8500000, 1000000, 1000),
  (1500000, 210000000, 340000000, 7000000),
  (2000000, 230000000, 330000000, 9000000),
  (1800000, 220000000, 310000000, 8000000),
  (1700000, 250000000, 350000000, 10000000),
  (1600000, 240000000, 320000000, 9500000),
  (1400000, 230000000, 310000000, 8500000),
  (1300000, 210000000, 290000000, 7500000),
  (1200000, 200000000, 280000000, 7000000),
  (1000000, 190000000, 270000000, 6500000);

INSERT INTO
  public.trasferimenti (
    stipendio_giocatore,
    budget_squadra_fornisce,
    budget_squadra_cliente,
    prezzo_trasferimento
  )
VALUES
  (900000, 180000000, 260000000, 6000000),
  (850000, 210000000, 240000000, 5000000),
  (950000, 220000000, 250000000, 5500000),
  (1100000, 230000000, 260000000, 6000000),
  (1300000, 250000000, 300000000, 6500000),
  (1500000, 240000000, 290000000, 7000000),
  (1600000, 210000000, 280000000, 7500000),
  (1700000, 220000000, 270000000, 8000000),
  (1800000, 230000000, 310000000, 8500000),
  (2000000, 240000000, 320000000, 9500000);

INSERT INTO
  public.trasferimenti (
    stipendio_giocatore,
    budget_squadra_fornisce,
    budget_squadra_cliente,
    prezzo_trasferimento
  )
VALUES
  (1900000, 250000000, 330000000, 10000000),
  (1800000, 230000000, 350000000, 9000000),
  (1700000, 220000000, 340000000, 8500000),
  (1600000, 210000000, 330000000, 8000000),
  (1500000, 200000000, 320000000, 7500000),
  (1400000, 190000000, 310000000, 7000000),
  (1300000, 180000000, 300000000, 6500000),
  (1200000, 170000000, 290000000, 6000000),
  (1100000, 160000000, 280000000, 5500000),
  (1000000, 150000000, 270000000, 5000000);

INSERT INTO
  public.trasferimenti (
    stipendio_giocatore,
    budget_squadra_fornisce,
    budget_squadra_cliente,
    prezzo_trasferimento
  )
VALUES
  (950000, 140000000, 260000000, 4500000),
  (900000, 130000000, 250000000, 4000000),
  (850000, 120000000, 240000000, 3500000),
  (800000, 110000000, 230000000, 3000000),
  (750000, 100000000, 220000000, 2500000),
  (700000, 95000000, 210000000, 2000000),
  (650000, 90000000, 200000000, 1500000),
  (600000, 85000000, 190000000, 1000000),
  (550000, 80000000, 180000000, 900000),
  (500000, 75000000, 170000000, 800000);

INSERT INTO
  public.trasferimenti (
    stipendio_giocatore,
    budget_squadra_fornisce,
    budget_squadra_cliente,
    prezzo_trasferimento
  )
VALUES
  (450000, 70000000, 160000000, 700000),
  (400000, 65000000, 150000000, 600000),
  (375000, 60000000, 140000000, 550000),
  (350000, 55000000, 130000000, 500000),
  (325000, 50000000, 120000000, 450000),
  (300000, 45000000, 110000000, 400000),
  (275000, 40000000, 100000000, 350000),
  (250000, 35000000, 90000000, 300000),
  (225000, 30000000, 80000000, 250000),
  (200000, 25000000, 70000000, 200000);

INSERT INTO
  public.trasferimenti (
    stipendio_giocatore,
    budget_squadra_fornisce,
    budget_squadra_cliente,
    prezzo_trasferimento
  )
VALUES
  (175000, 20000000, 60000000, 150000),
  (150000, 15000000, 50000000, 100000),
  (125000, 10000000, 40000000, 90000),
  (100000, 5000000, 30000000, 80000),
  (95000, 4800000, 20000000, 70000),
  (90000, 4500000, 10000000, 60000),
  (85000, 4200000, 5000000, 50000),
  (80000, 4000000, 3000000, 40000),
  (75000, 3800000, 2000000, 30000),
  (70000, 3600000, 1000000, 20000);

INSERT INTO
  public.trasferimenti (
    stipendio_giocatore,
    budget_squadra_fornisce,
    budget_squadra_cliente,
    prezzo_trasferimento
  )
VALUES
  (65000, 3400000, 800000, 15000),
  (60000, 3200000, 600000, 10000),
  (55000, 3000000, 400000, 8000),
  (50000, 2800000, 200000, 6000),
  (45000, 2600000, 100000, 4000),
  (40000, 2400000, 50000, 3000),
  (1800000, 210000000, 340000000, 7500000),
  (1500000, 230000000, 330000000, 10000000),
  (1300000, 220000000, 310000000, 8000000),
  (1600000, 250000000, 350000000, 12000000);

INSERT INTO
  public.trasferimenti (
    stipendio_giocatore,
    budget_squadra_fornisce,
    budget_squadra_cliente,
    prezzo_trasferimento
  )
VALUES
  (1400000, 240000000, 320000000, 9500000),
  (1200000, 230000000, 300000000, 7000000),
  (1000000, 220000000, 290000000, 6500000),
  (900000, 210000000, 270000000, 6000000),
  (850000, 200000000, 260000000, 5500000),
  (950000, 250000000, 240000000, 5000000),
  (1100000, 240000000, 250000000, 6000000),
  (1300000, 230000000, 220000000, 7000000),
  (1500000, 220000000, 270000000, 6500000),
  (1600000, 240000000, 280000000, 9000000);

INSERT INTO
  public.trasferimenti (
    stipendio_giocatore,
    budget_squadra_fornisce,
    budget_squadra_cliente,
    prezzo_trasferimento
  )
VALUES
  (1700000, 250000000, 300000000, 9500000),
  (1800000, 230000000, 310000000, 8500000),
  (2000000, 240000000, 320000000, 10000000),
  (1900000, 250000000, 330000000, 11000000),
  (1800000, 220000000, 340000000, 7500000),
  (1700000, 210000000, 350000000, 7000000),
  (1600000, 200000000, 330000000, 6500000),
  (1500000, 190000000, 320000000, 6000000),
  (1400000, 180000000, 310000000, 5500000),
  (1300000, 170000000, 300000000, 5000000);

INSERT INTO
  public.trasferimenti (
    stipendio_giocatore,
    budget_squadra_fornisce,
    budget_squadra_cliente,
    prezzo_trasferimento
  )
VALUES
  (1200000, 160000000, 290000000, 4500000),
  (1100000, 150000000, 280000000, 4000000),
  (1000000, 140000000, 270000000, 3500000),
  (950000, 130000000, 260000000, 3000000),
  (900000, 120000000, 250000000, 2500000),
  (850000, 110000000, 240000000, 2000000),
  (800000, 100000000, 230000000, 1500000),
  (750000, 95000000, 220000000, 1000000),
  (700000, 90000000, 210000000, 900000),
  (650000, 85000000, 200000000, 800000);

INSERT INTO
  public.trasferimenti (
    stipendio_giocatore,
    budget_squadra_fornisce,
    budget_squadra_cliente,
    prezzo_trasferimento
  )
VALUES
  (600000, 80000000, 190000000, 700000),
  (550000, 75000000, 180000000, 600000),
  (500000, 70000000, 170000000, 500000),
  (450000, 65000000, 160000000, 450000),
  (400000, 60000000, 150000000, 400000),
  (375000, 55000000, 140000000, 350000),
  (350000, 50000000, 130000000, 300000),
  (325000, 45000000, 120000000, 250000),
  (300000, 40000000, 110000000, 200000),
  (275000, 35000000, 100000000, 150000);

INSERT INTO
  public.trasferimenti (
    stipendio_giocatore,
    budget_squadra_fornisce,
    budget_squadra_cliente,
    prezzo_trasferimento
  )
VALUES
  (250000, 30000000, 90000000, 100000),
  (225000, 25000000, 80000000, 90000),
  (200000, 20000000, 70000000, 80000),
  (175000, 15000000, 60000000, 70000),
  (150000, 10000000, 50000000, 60000),
  (125000, 5000000, 40000000, 50000),
  (100000, 4800000, 30000000, 40000),
  (95000, 4500000, 20000000, 30000),
  (90000, 4200000, 10000000, 25000),
  (85000, 4000000, 5000000, 20000);

INSERT INTO
  public.trasferimenti (
    stipendio_giocatore,
    budget_squadra_fornisce,
    budget_squadra_cliente,
    prezzo_trasferimento
  )
VALUES
  (80000, 3800000, 2000000, 15000);
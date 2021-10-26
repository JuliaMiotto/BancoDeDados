CREATE TABLE PESSOAS (
    NOME   TEXT    NOT NULL,
    CPF    TEXT    NOT NULL
                   UNIQUE,
    IDADE  INTEGER NOT NULL,
    ESTADO TEXT,
    PRIMARY KEY (
        CPF
    )
);

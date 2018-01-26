create table midia(
	id int not null ,
    tipo varchar(255) not null,
    primary key(id)
);

create table gravadora(
	id int not null,
    nome varchar(255),
    cnpj double,
    Primary key(id)
);

create table genero(
	id int not null,
	tipo varchar(255),
    descricao varchar(255),
    primary key (id)
);

CREATE table album(
	id int not null,
	nome varchar(255) NOT NULL,
    id_artista int,
    id_genero int,
    id_gravadora int,
    qtd_musicas int not null,
    Primary key(id),
    foreign key(id_genero) references genero(id),
    foreign key(id_gravadora) references gravadora(id)
);

create table artista(

	id int  NOT NULL,
	nome varchar(255) not null,
	id_genero int,
    ano_formacao int,
    Id_albuns int,
    Primary key(id),
    foreign key(id_albuns) references album(id)

);

create table album_midia(
	id_midia int not null,
    id_album int not null,
    foreign key (id_midia) references midia(id),
    foreign key (id_album) references album(id),
	primary key (id_midia, id_album)
);
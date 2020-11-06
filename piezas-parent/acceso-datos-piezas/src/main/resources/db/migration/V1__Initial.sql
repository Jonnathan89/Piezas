create table usuario(
   id serial primary key not null,   
   username varchar(100),
   password varchar(100),
   typeuser varchar(50)
);


create table datamueblesaccesorios(
   id serial primary key not null,   
   nombre varchar(100) not null,
   primer_apellido varchar(100)not null,
   segundo_apellido varchar(100) ,
   tipo_identificacion smallint not null,
   identificacion integer not null,
   fecha date not null,
   numero_celular bigint not null,
   actividad_economica smallint not null,
   ingresos_mensuales bigint not null
);

insert into usuario(username, password, typeuser) values('digital','Digital2020','token');


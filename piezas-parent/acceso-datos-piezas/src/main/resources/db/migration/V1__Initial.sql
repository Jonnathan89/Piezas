create table usuario(
   id serial primary key not null,   
   username varchar(100),
   password varchar(100),
   typeuser varchar(50)
);


create table datamueblesaccesorios(
   id serial primary key not null,   
   nombre varchar(100),
   primer_apellido varchar(100),
   segundo_apellido varchar(100),
   tipo_identificacion varchar(100),
   identificacion integer not null,
   fecha date,
   numero_celular integer,
   actividad_economica varchar(100),
   ingresos_mensuales integer
);
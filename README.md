# Laboratorio 5 cvds

# Integrantes:
1. Deivid Medina
2. Eduardo Ospina

## Parte 1:

1. Abra una terminal Linux o consola de comandos Windows.
2. Realice una conexión síncrona TCP/IP a través de Telnet al siguiente servidor: 
    Host: www.escuelaing.edu.co
    Puerto: 80


![](https://i.postimg.cc/8z9YfJH9/indexlab51.jpg)


3. solicite al servidor el recurso ‘sssss/abc.html’, usando la versión 1.0 de HTTP.


![](https://i.postimg.cc/SK9v6S1s/lab52.jpg)
#### se da este resultado ya que se esta movimiendo todo por https y no se da el error deseado

### ¿Qué otros códigos de error existen?, ¿En qué caso se manejarán?:

	1. Error 3xx(redirecciones): esta clase de codigo de estatus indica que accion adicional se necesita ser tomada por el agente de usuario para completar la solicitud:
		1. 301: movido permanetemente, siginifica que la URI del recurso solicitado ha sido cambiado.
		2. 302: Encontrado, significaque el recurso URI solicitada ha sido cambiada temporalmente.
		3. 303: ver otro, el servidor envia una respuesta para dirigir al cliente a un nuevo recurso solicitado a otra direccion
		4. etc...
	2. Error 4xx(Errores de cliente): se usa para casos en donde el cliente parece estar equivocado. 
		1. 400: bad request, esta respuesta siginifica que el servidor no pudo interpretar la solicitud deada una sintacis invalida
		2. 401: sin autorizacion, es nesecario autenticar para obtener respuesta a la solicitud.
		3. 403: prohibido: el cliente no posse permisos necesarios para cierto contenido, por lo qu ese rechaza la solicitud.
		4. etc...
	3. Error 5xx(Errores d elos servidores): inidica cuando el servidor sabe que esta equivocado o es incapaz de hacer esa solicitud.
		1. 500: error interno del servidor, el servidor encontro una situacion que no sabe manejar.
		2. 501: no implementado, el metodo solicitado no esta soportado por el servidor y no puede manejarlo.
		3. 502: bad gateway, mientras el servidor trabaja como una puerta de enlace para u¿obtener una respuesta de la peticion, recibe una respuesta invalida
		4. etc...

4. Realice una nueva conexión con telnet: Host: www.httpbin.org, Puerto: 80, Versión HTTP: 1.1

![](https://i.postimg.cc/tJHLBNfM/lab53.jpg)
![](https://i.postimg.cc/q7PY7Gkv/lab54.jpg)

#### ¿Qué se obtiene como resultado?: se obtiene un 200 ok lo que significa que la solucitud a sido exitosa, regresando el recurso solicitado de manera exitosa.


5.  Seleccione el contenido HTML de la respuesta y copielo al cortapapeles CTRL-SHIFT-C. Ejecute el comando wc (word count) para contar palabras con la opción -c para contar el número de caracteres:

![](https://i.postimg.cc/Y23nc7m9/lab55.jpg)

#### ¿Cuál es la diferencia entre los verbos GET y POST?: 
	- el metodo GET añade los datos a la URI definida en el atributo de accion del formulario, mientras que POST los adjunta al organismo solicitado.
#### ¿Qué otros tipos de peticiones existen?: 
	1. Get
	2. Options
	3. Head
	4. Put
	5. Post
	6. Delete
	7. Connect
	8. Trace

6. En la practica no se utiliza telnet para hacer peticiones a sitios web sino el comando curl con ayuda de la linea de comandos:
	1. curl www.httpbin.org: 
	   ![](https://i.postimg.cc/MpR1S0rD/lab56.jpg)

	2. curl -v www.httpbin.org:
	   ![](https://i.postimg.cc/26HZw0Vz/lab57.jpg)
	   ![](https://i.postimg.cc/pr4nNyf4/lab58.jpg)

	3. https://i.postimg.cc/pr4nNyf4/lab58.jpg
	   ![](https://i.postimg.cc/0QHzmrBj/lab59.jpg)
	   ![](https://i.postimg.cc/d3kL9vbB/lab510.jpg)

	#### ¿Cuáles son las diferencias con los diferentes parámetros?:
		1. -v
		   ![](https://i.postimg.cc/vm0Lmr56/lab512.jpg)
		##### muestra una informacion completa de la peticion GET realizada y regresa el estado de la peticion en este caso 200 exitosa

		2. -i
		   ![](https://i.postimg.cc/hjh8QX0Z/indexlab511.jpg)
		##### solo muestra la informacion completa del estado de la peticion en este caso 200


## Bibliografia: 
- https://developer.mozilla.org/es/docs/Web/HTTP/Status
- https://datatracker.ietf.org/doc/html/rfc2616#page-70
- https://pc-solucion.es/2018/06/06/diferencias-entre-el-metodo-get-y-post/
# ucse-prog2-2023-U1-Delbono
![Forma Canónica Ejercicio  U1!null_0](https://github.com/MatiDelbono3/ucse-prog2-2023-U1-Delbono/assets/88385683/34530548-9ccf-4e05-9b43-88700807da56)
En el enunciado se individualizaron los siguientes componentes:

PAQUETES:

Productos: paquete utilizado para el manejo de los productos.

Envíos: paquete utilizado para el manejo de envíos.

Pagos: paquete utilizado para el manejo de los pagos.

INTERFACES:

Producto: interfaz a utilizar para la implementación del patrón Factory Method. Posee un método obtenerPrecio.

EstrategiaDeEnvio: interfaz a utilizar para la implementación del patrón Bridge. Posee un método CalcularCosto.

IngresoDePagos: interfaz a utilizar para la implementación del patrón Strategy.

Patrón Factory Method:

INTERFACES:

Producto: Posee un método obtenerPrecio.

CLASES:

product: contiene los datos comunes a todos los productos.
Existen también  3 clases, que corresponden a los diferentes tipos de producto. Cada una implementa la interfaz Producto. Éstas son:
- Ropa
- Electronica
- Vehiculos
  
Se tiene además una clase FabricaProductos, que contiene un método CrearProducto, el cual es implementado por las siguientes subclases:
- FabricaRopa
- FabricaElectronica
- FabricaVehiculos.

ENUMERADORES:

Se tiene también un enumerador para los tipos de producto.


//////ADICIÓN DE UN NUEVO TIPO DE PRODUCTO

En cuanto a la adición de un tipo de producto podemos decir que, créandose los mismos a través de un Selector de productos al que se pasa como parámetro el TIPO, proveniente de un ENUM, al agregar un tipo al mismo, y, contextualmente, un anidamiento del IF en el selector, el producto se agregaría.


Patrón Bridge:

INTERFACES:

EstrategiaDeEnvio: Posee un método CalcularCosto.

CLASES:

CalculosDelEnvio: contiene los datos comunes a todo envío, además de una instancia de EstrategiasDeEnvio.
Existen 3 clases, referidas a los distintos tipos de Envíos, que implementan la interfaz EstrategiasDeEnvio. Las mismas son:
- EnvioPorTierra
- EnvioPorBarco
- EnvioPorAvion.

ENUMERADORES:

Se nota también un enumerador para las formas de envío.

///////MODIFICACIÓN DEL COSTO DE ENVÍO DE UNA ESTRATEGIA PARTICULAR

Al calcularse el costo de envío, para cada estrategia, a través de un método abstracto, modificando la sobreescritura del mismo en la subclase que desea cambiarse, se modifica el costo de envío correspondiente. 

  
Patrón Strategy:

INTERFACES:

IngresoDePagos: Posee dos métodos: autorizar y capturar.

CLASES:

Existe una clase ManejadorDePagos, la cual posee una instancia de la interfaz IngresoDePagos , y un método ProcesadorDePagos.
Además se tiene una clase abstracta ProcesadorDePagos, la cual contiene dos métodos abstractos, ProcesarPago y ReintegrarPagos.
Se aprecia también una clase para cada método de procesamiento de pagos. Cada una de ellas hereda de la clase ProcesadorDePagos. Las mencionadas clases son:

-ProcesadorDePagosPayPal
-ProcesadorDePagosMercadoPago

Tenemos también una clase de Ingreso de Pagos para cada metodología. Cada clase hereda de ProcesadorDePagos e implementa la interfaz IngresoDePagos. Dichas clases son:
-IngresoDePagosPayPal
-IngresoDePagosMercadoPago.

ENUMERADORES

En última instancia, se utiliza un enumerador para los tipos de pago.

//////AGREGADO DE UN NUEVO TIPO DE PAGO

Para realizar esta acción se debe, en primer lugar, agregar el mismo al ENUM, y luego crear una nueva clase que procese los pagos realizados a través del nuevo método



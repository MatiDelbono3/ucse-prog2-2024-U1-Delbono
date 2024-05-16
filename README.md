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

IngresoDePagos: interfaz a utilizar para la implementación del patrón Strategy

CLASES:
Patrón Factory Method:

product: contiene los datos comunes a todos los productos.
Existen también  3 clases, que corresponden a los diferentes tipos de producto. Cada una implementa la interfaz Producto. Éstas son:
- Ropa
- Electronica
- Vehiculos
  
Se tiene además una clase FabricaProductos, que contiene un método CrearProducto, el cual es implementado por las siguientes subclases:
- FabricaRopa
- FabricaElectronica
- FabricaVehiculos.

Se tiene también un enumerador para los tipos de producto.

Patrón Bridge:

CalculosDelEnvio: contiene los datos comunes a todo envío, además de una instancia de EstrategiasDeEnvio.
Existen 3 clases, referidas a los distintos tipos de Envíos, que implementan la interfaz EstrategiasDeEnvio. Las mismas son:
- EnvioPorTierra
- EnvioPorBarco
- EnvioPorAvion.

Se nota también un enumerador para las formas de envío
  
Patrón Strategy:

Existe una clase ManejadorDePagos, la cual posee una instancia de la interfaz IngresoDePagos , y un método ProcesadorDePagos.
Además se tiene una clase abstracta ProcesadorDePagos, la cual contiene dos métodos abstractos, ProcesarPago y ReintegrarPagos.
Se aprecia también una clase para cada método de procesamiento de pagos. Cada una de ellas hereda de la clase ProcesadorDePagos. Las mencionadas clases son:
-ProcesadorDePagosPayPal
-ProcesadorDePagosMercadoPago

Tenemos también una clase de Ingreso de Pagos para cada metodología. Cada clase hereda de ProcesadorDePagos e implementa la interfaz IngresoDePagos. Dichas clases son:
-IngresoDePagosPayPal
-IngresoDePagosMercadoPago.

En última instancia, se utiliza un enumerador para los tipos de pago.

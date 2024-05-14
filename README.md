# ucse-prog2-2023-U1-Delbono
![Forma Canónica Ejercicio  U1!null_0](https://github.com/MatiDelbono3/ucse-prog2-2023-U1-Delbono/assets/88385683/34530548-9ccf-4e05-9b43-88700807da56)
En el enunciado se individualizaron los siguientes componentes:
PAQUETES:

Productos: paquete utilizado para el manejo de los productos.

Envíos: paquete utilizado para el manejo de envíos.

Pagos: paquete utilizado para el manejo de los pagos.

INTERFACES:

Producto: interfaz a utilizar para la implementación del patrón Factory Method

EstrategiaDeEnvio: interfaz a utilizar para la implementación del patrón Bridge

IngresoDePagos: interfaz a utilizar para la implementación del patrón Strategy

CLASES:
product: contiene los datos comunes a todos los productos.
FabricaProductos: contiene un método CrearProducto, el cual es implementado por las siguientes subclases:
- FabricaRopa
- FabricaElectronica
- FabricaVehiculos
  

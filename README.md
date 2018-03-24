# TP2-Observerable

Teniendo como premisa que el objeto que extiende de observable, Car (Auto), tiene agregado como observador al objeto Mechanic (Mecánico), al llamar a algún método de Car que genere un cambio de estado (setOilLevel,setWaterLevel,setTiresPressure) el método realizará el seteo del nuevo dato, invocará a setChanged() para establecer que el objeto ha sufrido un cambio de estado y por último, notificará al observador con notifyObservers(Object param), enviando como parámetro un diccionario (Map<String, Map<String,Integer>>) que contiene el nombre del atributo modificado con su viejo y actual valor.

El método notifyObservers, llama a los métodos update() de cada Observer enviandoles el propio objeto Observable y, si existiese, el parámetro adicional. En este caso, el método update de Mechanic recibirá el objeto Car y el diccionario con los datos viejos y nuevos.

Vale la pena resaltar, que por más que este es un ejemplo funcional, el hecho de recibir el diccionario genera que Mechanic y Car esten fuertemente acoplados. En un sistema real, se debería tratar de efectuar una mejor solución a esta problemática.

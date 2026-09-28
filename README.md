Titanic: Censo

Contexto del Proyecto
-Implementación clásica: censo del Titanic utilizando Java. El proyecto construye y evalúa un modelo de clasificación binaria para predecir la supervivencia de los pasajeros basándose en sus datos demográficos y características del viaje.

Stack Tecnológico
1. Lenguaje: Java (POO aplicada a modelos predictivos)
2. Técnicas: Preprocesamiento de datos (Imputación, Encoding), Entrenamiento de Modelo, Evaluación (Accuracy, Matriz de Confusión).

Arquitectura y Modelado
1. Data Preprocessing: Las clases de Java se encargan de limpiar los valores nulos (ej. rellenar la Edad) y codificar variables categóricas como el Sexo y la Cabina.
2. Clasificación: Se implementó y entrenó un modelo de [Ej: Random Forest / Regresión Logística] utilizando la API de la librería seleccionada.
3. Evaluación: El programa divide los datos en conjuntos de entrenamiento y prueba (Train/Test Split) y calcula las métricas de rendimiento.

Cómo ejecutar este proyecto
1. Clona el repositorio.
2. Descarga e incluye las dependencias necesarias (ej. `weka.jar`) en tu IDE o a través del `pom.xml` por Maven.
3. Ejecuta la clase `Main.java` para ver el entrenamiento y los resultados de la predicción en tiempo real.

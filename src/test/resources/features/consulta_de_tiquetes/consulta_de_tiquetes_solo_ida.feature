# language: es

Característica: Consultar tiquetes solo ida
Dado que no quiero gastar mucho tiempo en el aeropuerto
Como viajera casual
Quiero poder comprar tiquetes por internet


  Escenario: Jennifer quiere viajar de Medellin a Bogota y quiere ver los vuelos disponibles
  Jennifer prefiere escoger si viaja o no en primera clase.
  No está segura cuando va a regresar, así que prefiere consultar solo vuelos de ida.

    Dado que Jennifer ha decidido consultar la disponibilidad de vuelos
    Cuando ella mira los vuelos de Medellín a Bogotá partiendo desde mañana
    Entonces ella deberia ver las siguientes opciones de clase de vuelo:
      | Súper Promo |
      | Econo       |
      | Flexi       |
      | Ejecutiva   |
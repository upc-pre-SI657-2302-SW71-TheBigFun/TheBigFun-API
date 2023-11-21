# TheBigFun

TheBigFun es una plataforma diseñada para entusiastas de fiestas y eventos sociales que desean descubrir y participar en experiencias emocionantes. La aplicación facilita la conexión entre personas que buscan diversión y los organizadores que hacen posible cada evento.

## Enpoints

Líneas abajo se muestran los difrentes endpoints que posee el servicio.

### Seguridad

- `POST /api/v1/userss/auth/sign-in`: Inicia sesión con tu cuenta.
- `POST /api/v1/userss/auth/sign-up`: Regístrate para crear una cuenta.
- `GET /api/v1/userss` (Se requiere rol de administrador): Obtiene la lista de todos los usuarios registrados.

### Attendees

- `GET /api/v1/attendees`: Obtiene la lista de todos los asistentes.
- `GET /api/v1/attendees/{attendeeId}`: Obtiene la información de un asistente específico por su ID.
- `GET /api/v1/attendees/byname/{name}`: Obtiene la información de un asistente por su nombre.
- `POST /api/v1/attendees`: Crea un nuevo asistente.
- `PUT /api/v1/attendees/{attendeeId}`: Actualiza la información de un asistente existente.
- `DELETE /api/v1/attendees/{attendeeId}`: Elimina a un asistente por su ID.

### Organizers

- `GET /api/v1/organizers`: Obtiene la lista de todos los organizadores.
- `GET /api/v1/organizers/byname/{name}`: Obtiene la información de un organizador por su nombre.
- `GET /api/v1/organizers/{organizerId}`: Obtiene la información de un organizador por su ID.
- `POST /api/v1/organizers`: Crea un nuevo organizador.
- `PUT /api/v1/organizers/{organizerId}`: Actualiza la información de un organizador existente.
- `DELETE /api/v1/organizers/{organizerId}`: Elimina a un organizador por su ID.

### Eventos

- `GET /api/v1/events`: Obtiene la lista de todos los eventos.
- `POST /api/v1/events`: Crea un nuevo evento.
- `PUT /api/v1/events/{eventId}`: Actualiza la información de un evento existente.
- `DELETE /api/v1/events/{eventId}`: Elimina un evento por su ID.
  
### Organizer Events

- `GET /api/v1/organizersto`: Obtiene la lista de todos los eventos organizados.
- `GET /api/v1/organizersto/{organizerId}/events`: Obtiene la lista de eventos organizados por un organizador específico.
- `POST /api/v1/organizersto/{organizerId}/events/{eventId}`: Agrega un evento a la lista de eventos organizados por un organizador.

### Pagos

- `GET /api/v1/payments`: Obtiene la lista de todos los pagos.
- `GET /api/v1/payments/{paymentId}`: Obtiene la información de un pago específico por su ID.
- `POST /api/v1/payments`: Crea un nuevo pago.
- `DELETE /api/v1/payments/{paymentId}`: Elimina un pago por su ID.

### Pagos de Eventos

- `GET /api/v1/eventsp`: Obtiene la lista de todos los pagos asociados a eventos.
- `GET /api/v1/eventsp/{eventId}/payments`: Obtiene la lista de pagos asociados a un evento específico.
- `POST /api/v1/eventsp/{eventId}/payments/{paymentId}`: Agrega un pago a la lista de pagos asociados a un evento.

### Asistentes a Eventos

- `GET /api/v1/eventsto`: Obtiene la lista de todos los asistentes a eventos.
- `GET /api/v1/eventsto/attendees/{attendeeId}`: Obtiene la lista de eventos a los que ha asistido un asistente específico.
- `GET /api/v1/eventsto/{eventId}`: Obtiene la lista de asistentes a un evento específico.
- `POST /api/v1/eventsto/{eventId}/attendee/{attendeeId}`: Agrega un asistente a la lista de asistentes a un evento.

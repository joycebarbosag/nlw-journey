package com.rocketseat.planner.participant;

import java.util.UUID;

//obj criado só para transferir os dados entre participant e trip
public record ParticipantData(UUID id, String name, String email, Boolean isConfirmed) {
}

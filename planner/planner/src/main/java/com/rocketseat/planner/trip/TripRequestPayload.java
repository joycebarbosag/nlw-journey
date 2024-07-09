package com.rocketseat.planner.trip;

import java.util.List;

//classe record é um obj que não será alterado após receber via request
public record TripRequestPayload(String destination, String starts_at, String ends_at, List<String> emails_to_invite, String owner_email, String owner_name) {
}

package io.xstefank;

import io.narayana.lra.client.internal.proxy.nonjaxrs.LRAParticipantRegistry;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class DummyParticipantRegistry extends LRAParticipantRegistry {
}

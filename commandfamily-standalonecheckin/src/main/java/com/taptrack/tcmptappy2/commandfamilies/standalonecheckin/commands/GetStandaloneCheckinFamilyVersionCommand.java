package com.taptrack.tcmptappy2.commandfamilies.standalonecheckin.commands;

import com.taptrack.tcmptappy2.MalformedPayloadException;
import com.taptrack.tcmptappy2.commandfamilies.standalonecheckin.AbstractStandaloneCheckinMessage;

public class GetStandaloneCheckinFamilyVersionCommand extends AbstractStandaloneCheckinMessage {
    public static final byte COMMAND_CODE = (byte) 0xFF;

    @Override
    public void parsePayload(byte[] payload) throws MalformedPayloadException {

    }

    @Override
    public byte[] getPayload() { return new byte[0]; }

    @Override
    public byte getCommandCode() {
        return COMMAND_CODE;
    }
}

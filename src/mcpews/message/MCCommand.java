/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcpews.message;

import mcpews.command.*;

/**
 *
 * @author Jocopa3
 */
public class MCCommand extends MCBody {
    
    CommandInput input;
    CommandOrigin origin;
    String name;
    int version;
    String overload;
    
    public MCCommand(CommandInput input, CommandOrigin origin, String name, int version) {
        super(MessagePurposeType.COMMAND_REQUEST);
        
        this.input = input;
        this.origin = origin;
        this.name = name;
        this.version = version;
        this.overload = input.getOverload();
    }
    
    protected MCCommand() {
        super(MessagePurposeType.COMMAND_REQUEST);
    }
    
    protected void setInput(CommandInput input) {
        this.input = input;
        this.overload = input.getOverload();
    }
    
    protected void setOrigin(CommandOrigin origin) {
        this.origin = origin;
    }
    
    public String getName() {
        return name;
    }
    
    protected void setName(String name) {
        this.name = name;
    }
    
    protected void setVersion(int version) {
        this.version = version;
    }
    
    public String getOverload() {
        return overload;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcpews.command;

/**
 *
 * @author Jocopa3
 */
public abstract class CommandOrigin {
    private String type;
    
    public CommandOrigin(String type) {
        this.type = type;
    }
}

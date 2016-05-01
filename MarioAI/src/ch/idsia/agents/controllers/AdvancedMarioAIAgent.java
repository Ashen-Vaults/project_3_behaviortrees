/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.idsia.agents.controllers;

import ch.idsia.agents.learning.behaviorTree.*;
import ch.idsia.benchmark.mario.engine.sprites.Mario;
import ch.idsia.benchmark.mario.environments.Environment;

/**
 *
 * @author Alexsh
 * 
 * controller for Mario that tries to:
 * collect as many coins as possible, 
 * and kill as many enemies as possible.
 * 
 */
public class AdvancedMarioAIAgent extends BasicMarioAIAgent {
    
    protected Sequence _myBehavior = new Sequence(this);
    
    public AdvancedMarioAIAgent(String s) {
        super(s);
        reset();
    }
    
    public AdvancedMarioAIAgent(){
        super("AdvancedAI");
        reset();
    }
    
    public boolean[] getAction(){
        action[Mario.KEY_SPEED] = action[Mario.KEY_JUMP] = isMarioAbleToJump || !isMarioOnGround;
        return action;
    }

    public void reset(){
        
        action = new boolean[Environment.numberOfKeys];
        action[Mario.KEY_RIGHT] = true;
        action[Mario.KEY_SPEED] = true;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.idsia.agents.learning.behaviorTree.actions;

import ch.idsia.agents.controllers.BasicMarioAIAgent;
import ch.idsia.agents.learning.behaviorTree.Task;
import ch.idsia.benchmark.mario.engine.sprites.Mario;

/**
 *
 * @author Alexsh
 */
public class StopMoving extends Task{

    public StopMoving(BasicMarioAIAgent _agent) {
        super(_agent, null);
    }

    @Override
    public boolean run() {
        System.out.println("STOPP");
        this._agent.action[Mario.KEY_LEFT] = false;
        this._agent.action[Mario.KEY_RIGHT] = false;
        this._agent.action[Mario.KEY_SPEED] = false;
        this._agent.action[Mario.KEY_JUMP] = false;
        return true;
    }
    
}

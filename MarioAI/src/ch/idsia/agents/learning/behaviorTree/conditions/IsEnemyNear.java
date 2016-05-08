/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.idsia.agents.learning.behaviorTree.conditions;

import ch.idsia.agents.Agent;
import ch.idsia.agents.controllers.BasicMarioAIAgent;
import static ch.idsia.benchmark.mario.engine.Art.enemies;
import static ch.idsia.benchmark.mario.engine.GlobalOptions.marioEgoCol;
import static ch.idsia.benchmark.mario.engine.GlobalOptions.marioEgoRow;
import ch.idsia.benchmark.mario.engine.sprites.Mario;
import ch.idsia.benchmark.mario.engine.sprites.Sprite;

/**
 *
 * @author Alexsh
 */
public class IsEnemyNear extends Condition {
//    
    private final float _range = 100.0f;
    
    public IsEnemyNear(BasicMarioAIAgent _agent) {
        super(_agent);
    }
    
    @Override
    public boolean run() {
        
        int x = marioEgoRow;
        int y = marioEgoCol;
        //System.out.println(this.getClass().getSimpleName() + " STATUS: " + this.getStatus());
        return isCreature(this._agent.enemies[x][y + 2]) || isCreature(this._agent.enemies[x][y + 1]);
        
    }
    
    private boolean isCreature(int c)
    {
        switch (c)
        {
            case Sprite.KIND_GOOMBA:
            case Sprite.KIND_RED_KOOPA:
            case Sprite.KIND_RED_KOOPA_WINGED:
            case Sprite.KIND_GREEN_KOOPA_WINGED:
            case Sprite.KIND_GREEN_KOOPA:
                this._status = true;
                return true;
        }
        this._status = false;
        return false;
    }
    
}

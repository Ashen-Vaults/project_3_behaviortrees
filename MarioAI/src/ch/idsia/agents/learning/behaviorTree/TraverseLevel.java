/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.idsia.agents.learning.behaviorTree;

import ch.idsia.agents.controllers.BasicMarioAIAgent;
import ch.idsia.agents.learning.behaviorTree.CompositeTasks.CompositeTask;
import ch.idsia.agents.learning.behaviorTree.CompositeTasks.Selector;
import ch.idsia.agents.learning.behaviorTree.CompositeTasks.Sequence;
import ch.idsia.agents.learning.behaviorTree.actions.Jump;
import ch.idsia.agents.learning.behaviorTree.actions.MoveRight;
import ch.idsia.agents.learning.behaviorTree.conditions.IsNearLedge;
import java.util.ArrayList;

/**
 *
 * @author Alexsh
 */
public class TraverseLevel extends BehaviorTree {

    public TraverseLevel(BasicMarioAIAgent _agent) {
        super(_agent);
        this._myTasks = new ArrayList<>();
        //this._myTasks.add(new MoveRight(_agent));
        this._myTasks.add(new IsNearLedge(_agent));
        this._myTasks.add(new MoveRight(_agent));
        this._myTasks.add(new Jump(_agent));
        this._myTasks.add(new IsNearLedge(_agent));
        this._myComposite = new Selector(_agent,this._myTasks);
    }

}

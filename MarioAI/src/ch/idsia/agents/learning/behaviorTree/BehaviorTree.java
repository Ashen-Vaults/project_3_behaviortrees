/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.idsia.agents.learning.behaviorTree;

import ch.idsia.agents.controllers.BasicMarioAIAgent;
import ch.idsia.agents.learning.behaviorTree.CompositeTasks.CompositeTask;
import ch.idsia.agents.learning.behaviorTree.CompositeTasks.Sequence;
import ch.idsia.agents.learning.behaviorTree.actions.Jump;
import ch.idsia.agents.learning.behaviorTree.actions.MoveRight;
import ch.idsia.agents.learning.behaviorTree.conditions.IsNearLedge;
import java.util.ArrayList;

/**
 *
 * @author Alexsh
 */
public abstract class BehaviorTree extends Task {
    
     protected ArrayList<Task> _myTasks;
     protected CompositeTask _myComposite;

    public BehaviorTree(BasicMarioAIAgent _agent) {
        super(_agent);
        _myTasks = new ArrayList<>();
    }
     
 
     public ArrayList<Task> _getMyTasks(){
         return this._myTasks;
     }
     
     @Override
     public boolean run(){
         if(this._myComposite!=null)
            return this._myComposite.run();
         return false;
     }
     
     CompositeTask getMyCompositeTask(){
         return this._myComposite;
     }
}

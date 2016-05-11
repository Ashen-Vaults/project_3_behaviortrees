/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.idsia.agents.learning.behaviorTree.CompositeTasks;

import ch.idsia.agents.Agent;
import ch.idsia.agents.controllers.BasicMarioAIAgent;
import ch.idsia.agents.learning.behaviorTree.Task;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Alexsh
 */
public class CompositeTask extends Task {
    
    public ArrayList<Task> myTasks = new ArrayList<>();
    protected Iterator<Task> _currentTaskIter = myTasks.iterator();
    protected Task _current;
 
    public CompositeTask(BasicMarioAIAgent _agent, ArrayList<Task> _tasks) {
        super(_agent, null);
        this.myTasks = _tasks;
        if(this.myTasks!=null){
            this._currentTaskIter = this.myTasks.iterator();
            
            if(this._currentTaskIter!=null){
                if(this._currentTaskIter.hasNext()){
                    _current = this._currentTaskIter.next();
                    System.out.println("\n~~~~Current Task: " + _current.getClass().getSimpleName());
                }
            }
            
        }
    }

    @Override
    public boolean run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

package yahoo;

import java.util.Comparator;
/**
 * @Yahoo hackathon 2/28
 * Team BAGEL
 */
public class myComparator implements Comparator
{
    
    private String sort;
    
    public myComparator( String sort)
    {
        this.sort = sort;
    }
    
    @Override
    public int compare(Object error1, Object error2)
    {
        Alert errorPrev = (Alert)error1;
        Alert errorAfter = (Alert)error2;
        
        if (sort.equals("severity") ) //sort by severity
        {
        	if(0==((Integer)errorPrev.getSeverity()).compareTo( (Integer)errorAfter.getSeverity() )){
        		return ((Integer)errorPrev.getCount()).compareTo( errorAfter.getCount() );
        	}else{
        		return ((Integer)errorPrev.getSeverity()).compareTo( (Integer)errorAfter.getSeverity() );
        	}
        }
        else if ( sort.equals("count") ) //sort by count
        {
        	if(0==((Integer)errorPrev.getCount()).compareTo( errorAfter.getCount() )){
        		return ((Integer)errorPrev.getSeverity()).compareTo( (Integer)errorAfter.getSeverity() );
        	}else{
        		return ((Integer)errorPrev.getCount()).compareTo( errorAfter.getCount() );
        	}
        }
        else if ( sort.equals("firstOccurence") ) 
        {
            return errorPrev.getFirstOccurrence().compareTo( errorAfter.getFirstOccurrence() );
        }
        else
        	return -1;
    }
}

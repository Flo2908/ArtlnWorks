grammar test3;
options {backtrack=true;} 
or        :           and '/' or
            |           and
            ;
            
and      :           not '+' and
            |           not
            ;
            
not      :           '-'* Term
            ;
 
Term    :           '(' or ')'
            |           Lit
            ;
 
Lit          :           ('A'..'Z'|'a'..'z')+
            ;
             

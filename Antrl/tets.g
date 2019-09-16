grammar tets;
rule 	:	or EOF;
 
or        :         and  ('/'  and)*
            ;
            
and      :           not ('+' not)*
                       
            ;
            
not      :           '-'* term
            ;
 
term    :           '(' or ')'
            |           Lit
            ;
 
Lit          :           ('A'..'Z'|'a'..'z')+
            ;
             

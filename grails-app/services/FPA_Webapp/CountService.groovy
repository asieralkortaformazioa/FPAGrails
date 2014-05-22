package FPA_Webapp

import grails.transaction.Transactional

//@Transactional
class CountService {

    def serviceMethod() {

    }

    enum ComplexityTypes {ILF, EIF}


    def getFPCount ( String type , Integer hcount, Integer vcount)
    {
        Integer result= 0;

        def query = Complexitymatrix.where {
            horizontallowlimit <= hcount && horizontaltoplimit>=hcount && verticallowlimit<= vcount && verticaltoplimit >= vcount
        }

        Complexitymatrix cm =query.find()
        complexity = cm.complexity;
        result =translateComplexity (type, )
        return result;
    }


    def translateComplexity (String type, Integer complexityId)
    {

        def query = Cpxtranslation.where {
            type== type && complexity==complexityId
        }

        Cpxtranslation translated =  query.find();
        return translated.ufp;
    }

}

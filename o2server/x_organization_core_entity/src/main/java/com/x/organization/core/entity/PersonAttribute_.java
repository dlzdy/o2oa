/** 
 *  Generated by OpenJPA MetaModel Generator Tool.
**/

package com.x.organization.core.entity;

import com.x.base.core.entity.SliceJpaObject_;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;

@javax.persistence.metamodel.StaticMetamodel
(value=com.x.organization.core.entity.PersonAttribute.class)
@javax.annotation.Generated
(value="org.apache.openjpa.persistence.meta.AnnotationProcessor6",date="Thu Dec 27 11:41:00 CST 2018")
public class PersonAttribute_ extends SliceJpaObject_  {
    public static volatile ListAttribute<PersonAttribute,String> attributeList;
    public static volatile SingularAttribute<PersonAttribute,String> description;
    public static volatile SingularAttribute<PersonAttribute,String> distinguishedName;
    public static volatile SingularAttribute<PersonAttribute,String> id;
    public static volatile SingularAttribute<PersonAttribute,String> name;
    public static volatile SingularAttribute<PersonAttribute,Integer> orderNumber;
    public static volatile SingularAttribute<PersonAttribute,String> person;
    public static volatile SingularAttribute<PersonAttribute,String> pinyin;
    public static volatile SingularAttribute<PersonAttribute,String> pinyinInitial;
    public static volatile SingularAttribute<PersonAttribute,String> unique;
}

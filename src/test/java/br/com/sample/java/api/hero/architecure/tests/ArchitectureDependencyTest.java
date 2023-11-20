/*
package br.com.sample.java.api.hero.architecure.tests;

public class SampleTest {

    //TODO: Componente x Pacote

    //TODO: Tipo

    //TODO: Annotation

   //TODO: Herança

    //TODO: Nome

    //TODO: Injeção de dependência

    //TODO: Customizada

}

*/

package br.com.sample.java.api.hero.architecure.tests;

import static com.tngtech.archunit.library.dependencies.SlicesRuleDefinition.slices;

import com.tngtech.archunit.core.domain.JavaClass;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;
import com.tngtech.archunit.library.dependencies.SliceAssignment;
import com.tngtech.archunit.library.dependencies.SliceIdentifier;

@AnalyzeClasses(packages = "br.com.sample.java.api.hero")
public class ArchitectureDependencyTest {

/*	
    @ArchTest
    static final ArchRule no_cycles_by_method_calls_between_slices =
            slices().matching("..(simplecycle).(*)..").namingSlices("$2 of $1").should().beFreeOfCycles();

    @ArchTest
    static final ArchRule no_cycles_by_constructor_calls_between_slices =
            slices().matching("..(constructorcycle).(*)..").namingSlices("$2 of $1").should().beFreeOfCycles();

    @ArchTest
    static final ArchRule no_cycles_by_inheritance_between_slices =
            slices().matching("..(inheritancecycle).(*)..").namingSlices("$2 of $1").should().beFreeOfCycles();

    @ArchTest
    static final ArchRule no_cycles_by_field_access_between_slices =
            slices().matching("..(fieldaccesscycle).(*)..").namingSlices("$2 of $1").should().beFreeOfCycles();

    @ArchTest
    static final ArchRule no_cycles_by_member_dependencies_between_slices =
            slices().matching("..(membercycle).(*)..").namingSlices("$2 of $1").should().beFreeOfCycles();

    @ArchTest
    static final ArchRule no_cycles_in_simple_scenario =
            slices().matching("..simplescenario.(*)..").namingSlices("$1").should().beFreeOfCycles();

    @ArchTest
    static final ArchRule no_cycles_in_complex_scenario =
            slices().matching("..(complexcycles).(*)..").namingSlices("$2 of $1").should().beFreeOfCycles();

*/

}

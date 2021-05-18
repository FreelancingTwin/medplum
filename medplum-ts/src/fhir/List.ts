/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

import { Annotation } from './Annotation';
import { CodeableConcept } from './CodeableConcept';
import { Extension } from './Extension';
import { Identifier } from './Identifier';
import { Meta } from './Meta';
import { Narrative } from './Narrative';
import { Reference } from './Reference';
import { Resource } from './Resource';

/**
 * A list is a curated collection of resources.
 */
export interface List {

  /**
   * This is a List resource
   */
  readonly resourceType: 'List';

  /**
   * The logical id of the resource, as used in the URL for the resource.
   * Once assigned, this value never changes.
   */
  readonly id?: string;

  /**
   * The metadata about the resource. This is content that is maintained by
   * the infrastructure. Changes to the content might not always be
   * associated with version changes to the resource.
   */
  readonly meta?: Meta;

  /**
   * A reference to a set of rules that were followed when the resource was
   * constructed, and which must be understood when processing the content.
   * Often, this is a reference to an implementation guide that defines the
   * special rules along with other profiles etc.
   */
  readonly implicitRules?: string;

  /**
   * The base language in which the resource is written.
   */
  readonly language?: string;

  /**
   * A human-readable narrative that contains a summary of the resource and
   * can be used to represent the content of the resource to a human. The
   * narrative need not encode all the structured data, but is required to
   * contain sufficient detail to make it &quot;clinically safe&quot; for a human to
   * just read the narrative. Resource definitions may define what content
   * should be represented in the narrative to ensure clinical safety.
   */
  readonly text?: Narrative;

  /**
   * These resources do not have an independent existence apart from the
   * resource that contains them - they cannot be identified independently,
   * and nor can they have their own independent transaction scope.
   */
  readonly contained?: Resource[];

  /**
   * May be used to represent additional information that is not part of
   * the basic definition of the resource. To make the use of extensions
   * safe and manageable, there is a strict set of governance  applied to
   * the definition and use of extensions. Though any implementer can
   * define an extension, there is a set of requirements that SHALL be met
   * as part of the definition of the extension.
   */
  readonly extension?: Extension[];

  /**
   * May be used to represent additional information that is not part of
   * the basic definition of the resource and that modifies the
   * understanding of the element that contains it and/or the understanding
   * of the containing element's descendants. Usually modifier elements
   * provide negation or qualification. To make the use of extensions safe
   * and manageable, there is a strict set of governance applied to the
   * definition and use of extensions. Though any implementer is allowed to
   * define an extension, there is a set of requirements that SHALL be met
   * as part of the definition of the extension. Applications processing a
   * resource are required to check for modifier extensions.
   *
   * Modifier extensions SHALL NOT change the meaning of any elements on
   * Resource or DomainResource (including cannot change the meaning of
   * modifierExtension itself).
   */
  readonly modifierExtension?: Extension[];

  /**
   * Identifier for the List assigned for business purposes outside the
   * context of FHIR.
   */
  readonly identifier?: Identifier[];

  /**
   * Indicates the current state of this list.
   */
  readonly status?: string;

  /**
   * How this list was prepared - whether it is a working list that is
   * suitable for being maintained on an ongoing basis, or if it represents
   * a snapshot of a list of items from another source, or whether it is a
   * prepared list where items may be marked as added, modified or deleted.
   */
  readonly mode?: string;

  /**
   * A label for the list assigned by the author.
   */
  readonly title?: string;

  /**
   * This code defines the purpose of the list - why it was created.
   */
  readonly code?: CodeableConcept;

  /**
   * The common subject (or patient) of the resources that are in the list
   * if there is one.
   */
  readonly subject?: Reference;

  /**
   * The encounter that is the context in which this list was created.
   */
  readonly encounter?: Reference;

  /**
   * The date that the list was prepared.
   */
  readonly date?: Date;

  /**
   * The entity responsible for deciding what the contents of the list
   * were. Where the list was created by a human, this is the same as the
   * author of the list.
   */
  readonly source?: Reference;

  /**
   * What order applies to the items in the list.
   */
  readonly orderedBy?: CodeableConcept;

  /**
   * Comments that apply to the overall list.
   */
  readonly note?: Annotation[];

  /**
   * Entries in this list.
   */
  readonly entry?: ListEntry[];

  /**
   * If the list is empty, why the list is empty.
   */
  readonly emptyReason?: CodeableConcept;
}

/**
 * A list is a curated collection of resources.
 */
export interface ListEntry {

  /**
   * Unique id for the element within a resource (for internal references).
   * This may be any string value that does not contain spaces.
   */
  readonly id?: string;

  /**
   * May be used to represent additional information that is not part of
   * the basic definition of the element. To make the use of extensions
   * safe and manageable, there is a strict set of governance  applied to
   * the definition and use of extensions. Though any implementer can
   * define an extension, there is a set of requirements that SHALL be met
   * as part of the definition of the extension.
   */
  readonly extension?: Extension[];

  /**
   * May be used to represent additional information that is not part of
   * the basic definition of the element and that modifies the
   * understanding of the element in which it is contained and/or the
   * understanding of the containing element's descendants. Usually
   * modifier elements provide negation or qualification. To make the use
   * of extensions safe and manageable, there is a strict set of governance
   * applied to the definition and use of extensions. Though any
   * implementer can define an extension, there is a set of requirements
   * that SHALL be met as part of the definition of the extension.
   * Applications processing a resource are required to check for modifier
   * extensions.
   *
   * Modifier extensions SHALL NOT change the meaning of any elements on
   * Resource or DomainResource (including cannot change the meaning of
   * modifierExtension itself).
   */
  readonly modifierExtension?: Extension[];

  /**
   * The flag allows the system constructing the list to indicate the role
   * and significance of the item in the list.
   */
  readonly flag?: CodeableConcept;

  /**
   * True if this item is marked as deleted in the list.
   */
  readonly deleted?: boolean;

  /**
   * When this item was added to the list.
   */
  readonly date?: Date;

  /**
   * A reference to the actual resource from which data was derived.
   */
  readonly item?: Reference;
}
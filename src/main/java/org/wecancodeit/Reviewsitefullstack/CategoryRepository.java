package org.wecancodeit.Reviewsitefullstack;

import java.util.Collection;

import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {

	Category findByName(String name);

}
